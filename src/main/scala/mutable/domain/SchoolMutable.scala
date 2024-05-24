package mutable.domain

import scala.collection.mutable.{Buffer => MBuffer}

class SchoolMutable extends School {
  private val students: MBuffer[Name] = MBuffer.empty[Name]

  def addStudent(name: Name): Unit = {
    students += name
  }

  def getStudents: MBuffer[Name] = {
    students
  }
}
