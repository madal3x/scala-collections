package mutable.domain

import scala.collection.concurrent.TrieMap

class SchoolConcurrent extends School {
  private val students = TrieMap.empty[Name, Name]

  def addStudent(name: Name): Unit = {
    students += name -> name
  }

  def getStudents: Iterable[Name] = {
    students.values
  }
}
