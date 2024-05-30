package concurrentParallel

import com.typesafe.scalalogging.LazyLogging
import common.Palindrome

import scala.collection.parallel.ForkJoinTaskSupport

object ParallelCollections extends App with LazyLogging {
  (1 to 1000000).par
    .filter(Palindrome.isPalindrome)
    .foreach(i => logger.info(i.toString))

  // using a custom ForkJoinPool
  val forkJoinPool = new java.util.concurrent.ForkJoinPool(2)
  val evenNumbers = (2 to 2000000 by 2).par
  evenNumbers.tasksupport = new ForkJoinTaskSupport(forkJoinPool)
  evenNumbers.filter(Palindrome.isPalindrome).foreach(i => logger.info(i.toString))
  forkJoinPool.shutdown()
}
