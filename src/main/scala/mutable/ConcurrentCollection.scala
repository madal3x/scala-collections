package mutable

import mutable.domain.SchoolConcurrent

// list other concurrent collections
object ConcurrentCollection extends App with SchoolConcurrentExample {
  runExample(new SchoolConcurrent)
}