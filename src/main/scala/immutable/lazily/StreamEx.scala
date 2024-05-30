package immutable.lazily

// LazyList in Scala 2.13
object StreamEx extends App {
  // #:: - the cons operator for Stream, the tail parameter is by-name making its tail lazily evaluated
  def natsFrom(n: Int): Stream[Int] =
    n #:: natsFrom(n + 1)

  val nats = natsFrom(0)
  println(nats)
  println(nats.take(10).toList)

  // Sieve of Eratosthenes
  // https://commons.wikimedia.org/wiki/File:New_Animation_Sieve_of_Eratosthenes.gif
  // https://www.geogebra.org/m/uGX53dy7
  // sieve is a recursive function that filters out non-prime numbers from the stream
  def sieve(stream: Stream[Int] = natsFrom(2)): Stream[Int] = {
    stream.head #:: sieve(stream.tail.filter(_ % stream.head != 0))
  }

  val primes: Stream[Int] = sieve()
  println(primes.take(100).toList)
  println(primes.take(101).toList)
}
