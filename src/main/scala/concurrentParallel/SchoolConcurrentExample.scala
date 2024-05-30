package concurrentParallel

import domain.school.School
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

trait SchoolConcurrentExample {
  def runExample(school: School): Unit = {
    val nrStudents = 100
    val registerStudentsFutures = (1 to nrStudents).map { i =>
      Future {
        school.registerStudent(s"Student $i")
      }
    }

    Await.result(Future.sequence(registerStudentsFutures), 10.seconds)

    println(s"""Nr students in School: ${school.allStudents.size}\nExpecting: ${nrStudents}""")
  }
}
