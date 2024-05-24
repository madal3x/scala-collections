package mutable

import mutable.domain.SchoolMutable

object CopyReference extends App {
  val school = new SchoolMutable
  school.addStudent("Anna")
  school.addStudent("Rik")

  // Here we copy the reference of the students field from the School instance to the local variable students
  val students = school.getStudents
  println(s"Students: $students")

  // Modifying the local variable students will modify also the students inside the School instance
  students += "David"

  println(s"School students: ${school.getStudents}")
}
