package common

object Palindrome {
  def isPalindrome(number: Int): Boolean = {
    val numStr = number.toString
    numStr == numStr.reverse
  }
}
