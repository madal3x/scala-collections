package mutable

import mutable.domain.School

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object SchoolConcurrentExample {
  def runExample(school: School): Unit = {
    val nrStudents = 100
    val addStudentsFutures = (1 to nrStudents).map { i =>
      Future {
        school.addStudent(s"Student $i")
      }
    }

    Await.result(Future.sequence(addStudentsFutures), 10.seconds)

    println(s"""Nr students in School: ${school.getStudents.size}\nExpecting: ${nrStudents}""")
  }
}
