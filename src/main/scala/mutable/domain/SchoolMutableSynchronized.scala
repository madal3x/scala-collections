package mutable.domain

import scala.collection.mutable.{Buffer => MBuffer}

class SchoolMutableSynchronized extends School {
  private val students: MBuffer[Name] = MBuffer.empty[Name]

  def addStudent(name: Name): Unit = synchronized {
    students += name
  }

  def getStudents: MBuffer[Name] = {
    students
  }
}
