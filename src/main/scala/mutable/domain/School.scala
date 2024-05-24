package mutable.domain

trait School {
  type Name = String

  def addStudent(name: Name): Unit
  def getStudents: Iterable[Name]
}
