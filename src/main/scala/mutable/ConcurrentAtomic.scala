package mutable

import mutable.domain.SchoolAtomic

// list other Atomic's from Java
object ConcurrentAtomic extends App {
  SchoolConcurrentExample.runExample(new SchoolAtomic)
}
