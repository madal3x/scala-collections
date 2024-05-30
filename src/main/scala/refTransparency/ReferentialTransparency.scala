package refTransparency

object ReferentialTransparency extends App {
  var count = 0

  def increment(): Int = {
    count += 1
    count
  }

  val result1 = increment() // result1 = 1
  println(result1)
  val result2 = increment() // result2 = 2
  println(result2)
  // increment() cannot be replaced with a single value as it changes the state.

  // =============================================

  val list = List(1, 2, 3)

  def appendElement(immutableList: List[Int], elem: Int): List[Int] = {
    immutableList :+ elem
  }

  val newList1 = appendElement(list, 4)  // newList1 is List(1, 2, 3, 4)
  println(newList1)
  val newList2 = appendElement(list, 4)  // newList2 is List(1, 2, 3, 4)
  println(newList2)
  // appendElement is referentially transparent
  // newList1 and newList2 are identical and can replace each other without changing the program behavior

  // =============================================

  import scala.collection.mutable.ArrayBuffer

  val buffer = ArrayBuffer(1, 2, 3)

  def appendElementMut(mutableBuffer: ArrayBuffer[Int], elem: Int): ArrayBuffer[Int] = {
    mutableBuffer += elem
    mutableBuffer
  }

  val buffer1 = appendElementMut(buffer, 4) // buffer1 is ArrayBuffer(1, 2, 3, 4)
  println(buffer1)
  val buffer2 = appendElementMut(buffer, 4) // buffer2 is ArrayBuffer(1, 2, 3, 4, 4)
  println(buffer2)
  // appendElementMut is not referentially transparent
  // buffer1 and buffer2 are different, and you cannot replace appendElement calls directly
}
