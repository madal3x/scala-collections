package immutable.seq

object ListEx extends App {
  // :: - Cons operator
  // operators beginning with : apply to the right
  // Nil a singleton, extending List[Nothing], signifies empty list
  //   with the :: operator Nil signifies the end of the list
  val list = 1 :: 2 :: 3 :: Nil
  // desugared form of the above
  val list2 = 1 :: (2 :: (3 :: Nil))
  // using Cons case class
  val list3 = ::(1, ::(2, ::(3, Nil)))

  // Cons facilitates pattern matching with it
  list match {
    case 1 :: 2 :: _ => println("first 2 elements are 1 and 2")
  }
}
