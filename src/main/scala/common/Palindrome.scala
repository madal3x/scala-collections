package common

object Palindrome {
  // palindrome numbers: 12321, 789987
  def isPalindrome(number: Int): Boolean = {
    val numStr = number.toString
    numStr == numStr.reverse
  }
}
