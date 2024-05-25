package mutable

import mutable.domain.SchoolMutableSynchronized

object ConcurrentSynchronized extends App with SchoolConcurrentExample {
  runExample(new SchoolMutableSynchronized)
}
