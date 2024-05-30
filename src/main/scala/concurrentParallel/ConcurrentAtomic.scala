package concurrentParallel

import domain.school.SchoolAtomic

object ConcurrentAtomic extends App with SchoolConcurrentExample {
  runExample(new SchoolAtomic)
}
