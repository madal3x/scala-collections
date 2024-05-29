package concurrentParallel.domain

import scala.collection.concurrent.TrieMap

class SchoolConcurrent extends School {
  private val students = TrieMap.empty[Student, Student]

  def registerStudent(student: Student): Unit = {
    students += student -> student
  }

  def allStudents: Iterable[Student] = {
    students.values
  }
}
