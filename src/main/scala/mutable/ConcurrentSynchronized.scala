package mutable

import mutable.domain.SchoolMutableSynchronized

// improves the ConcurrentNondeterministic using synchronized,
// which ensures that only one thread at a time has access inside its block
object ConcurrentSynchronized extends App {
  SchoolConcurrentExample.runExample(new SchoolMutableSynchronized)
}
