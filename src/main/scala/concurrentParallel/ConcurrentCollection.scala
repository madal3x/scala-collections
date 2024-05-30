package concurrentParallel

import domain.school.SchoolConcurrent

object ConcurrentCollection extends App with SchoolConcurrentExample {
  runExample(new SchoolConcurrent)
}
