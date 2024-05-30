package concurrentParallel

import domain.school.SchoolMutableSynchronized

object ConcurrentSynchronized extends App with SchoolConcurrentExample {
  runExample(new SchoolMutableSynchronized)
}
