package domain.school

import scala.collection.mutable.{Buffer => MBuffer}

class SchoolMutableSynchronized extends School {
  private val students: MBuffer[Student] = MBuffer.empty[Student]

  // using synchronized ensures that only one thread at a time has access inside its block
  def registerStudent(student: Student): Unit = synchronized {
    students += student
  }

  def allStudents: MBuffer[Student] = {
    students
  }
}
