package concurrent

import concurrent.domain.SchoolMutableSynchronized

object ConcurrentSynchronized extends App with SchoolConcurrentExample {
  runExample(new SchoolMutableSynchronized)
}
