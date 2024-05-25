package immutable.set

object StopwordsSet extends App {
  val stopwords: Set[String] = Set("the", "and", "or", "is", "in", "on", "at", "to")

  // the variable stopwords of type Set[String] can be passed to a variable expecting a Function of type String => Boolean
  val isStopword: String => Boolean = stopwords

  val phrase = "The cat sat on the mat."

  val phraseWithoutStopwords = phrase.split(" ").filterNot(stopwords).mkString(" ")
  println(phraseWithoutStopwords)
}
