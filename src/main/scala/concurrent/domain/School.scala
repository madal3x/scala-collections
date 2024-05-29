package concurrent.domain

trait School {
  type Student = String

  def registerStudent(student: Student): Unit
  def allStudents: Iterable[Student]
}
