package domain.school

trait School {
  type Student = String

  def registerStudent(student: Student): Unit
  def allStudents: Iterable[Student]
}
