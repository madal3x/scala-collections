package immutable.map

import scala.collection.immutable.TreeMap

object MapEx extends App {
  val orderingByLength: Ordering[String] = Ordering.by(_.length)
  val treeMap = TreeMap("cccc" -> 4, "bbb" -> 3, "dd" -> 2, "a" -> 1)(orderingByLength)
  println(treeMap)
  println(treeMap.range("bbb", "cccc"))
}