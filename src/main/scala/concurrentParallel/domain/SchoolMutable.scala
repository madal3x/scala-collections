package concurrentParallel.domain

import scala.collection.mutable.{Buffer => MBuffer}

class SchoolMutable extends School {
  private val students: MBuffer[Student] = MBuffer.empty[Student]

  def registerStudent(student: Student): Unit = {
    students += student
  }

  def allStudents: MBuffer[Student] = {
    students
  }
}
