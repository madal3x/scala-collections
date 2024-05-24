package mutable.domain

import java.util.concurrent.atomic.AtomicReference
import scala.collection.mutable.{Buffer => MBuffer}

class SchoolAtomic extends School {
  private val studentsRef: AtomicReference[MBuffer[Name]] =
    new AtomicReference[MBuffer[Name]](MBuffer.empty)

  def addStudent(name: Name): Unit = {
    // getAndUpdate doc tells us the function passed should not be a side-effect,
    // so we will not modify students but will return another MBuffer
    // with side-effect: students += name
    studentsRef.getAndUpdate(students => students :+ name)
  }

  def getStudents: MBuffer[Name] = {
    studentsRef.get()
  }
}
