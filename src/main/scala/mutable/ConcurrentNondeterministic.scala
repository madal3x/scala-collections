package mutable

import mutable.domain.SchoolMutable

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

// show AnyRef, AnyVal hierarchy & tell about copy value or copy reference
object ConcurrentNondeterministic extends App with SchoolConcurrentExample {
  runExample(new SchoolMutable)
}
