package immutable.lazily

object ViewsEx extends App {

  println(findFirstPalindromes(10))

  def findFirstPalindromes(count: Int): Seq[Int] = {
    (10 to Int.MaxValue)
      .view // all operations from here onwards are done lazily
      .filter(isPalindrome)
      .take(count)
      .toList // toList triggers the evaluation
  }
  // other methods that trigger the evaluation of the view: toSeq, toArray, toIndexedSeq, toSet, toMap, force

  def isPalindrome(number: Int): Boolean = {
    val numStr = number.toString
    numStr == numStr.reverse
  }
}