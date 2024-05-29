package concurrentParallel

import concurrentParallel.domain.SchoolMutableSynchronized

object ConcurrentSynchronized extends App with SchoolConcurrentExample {
  runExample(new SchoolMutableSynchronized)
}
