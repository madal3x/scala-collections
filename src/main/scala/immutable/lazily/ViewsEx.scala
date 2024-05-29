package immutable.lazily

import common.Palindrome

object ViewsEx extends App {

  println(findFirstPalindromes(10))

  def findFirstPalindromes(count: Int): Seq[Int] = {
    (10 to Int.MaxValue)
      .view // all operations from here onwards are done lazily
      .filter(Palindrome.isPalindrome)
      .take(count)
      .toList // toList triggers the evaluation
  }
  // other methods that trigger the evaluation of the view: toSeq, toArray, toIndexedSeq, toSet, toMap, force
}