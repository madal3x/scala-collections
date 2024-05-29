package concurrent

import concurrent.domain.SchoolAtomic

// list other Atomic's from Java
object ConcurrentAtomic extends App with SchoolConcurrentExample {
  runExample(new SchoolAtomic)
}
