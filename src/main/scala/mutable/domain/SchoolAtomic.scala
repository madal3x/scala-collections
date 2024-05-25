package mutable.domain

import java.util.concurrent.atomic.AtomicReference
import scala.collection.mutable.{Buffer => MBuffer}

class SchoolAtomic extends School {
  private val studentsRef: AtomicReference[MBuffer[Student]] =
    new AtomicReference[MBuffer[Student]](MBuffer.empty)

  def registerStudent(student: Student): Unit = {
    // getAndUpdate doc tells us the function passed should not be a side-effect,
    // so we will not modify the variable inside the AtomicReference but will return another MBuffer
    // with side-effect: students += name
    studentsRef.getAndUpdate(students => students :+ student)
  }

  def allStudents: MBuffer[Student] = {
    studentsRef.get()
  }
}
