package concurrentParallel

import concurrentParallel.domain.SchoolMutable

// show AnyRef, AnyVal hierarchy & tell about copy value or copy reference
/*
C reads map (A,B)
D reads map (A,B)
C writes map (A,B,C)
E reads map (A,B,C)
D writes map (A, B, D)
F reads map (A, B, D)
 */
object ConcurrentNondeterministic extends App with SchoolConcurrentExample {
  runExample(new SchoolMutable)
}
