package mutable

import mutable.domain.SchoolMutable

object CopyReference extends App {
  val school = new SchoolMutable
  school.registerStudent("Anna")
  school.registerStudent("Rik")

  // Here we copy the reference of the students field from the School instance to the local variable students
  val students = school.allStudents
  println(s"School students: $students")

  // Modifying the local variable students will modify also the students inside the School instance
  students += "David"

  println(s"School students after local mutation: ${school.allStudents}")
}
