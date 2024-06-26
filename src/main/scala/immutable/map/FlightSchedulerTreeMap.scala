package immutable.map

import domain.flightScheduler._

import java.time.{Duration, Instant}
import scala.concurrent.{Await, Future}
import scala.util.Random
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FlightSchedulerTreeMap extends App {
  val nrFlights = 100
  // not thread safe implementation of FlightSchedulerTreeMap
  val flightScheduler = new FlightSchedulerTreeMap
  val scheduleFlights = (1 to nrFlights).map(_ =>
    Future(
      flightScheduler.scheduleFlight(randomFlight())
    )
  )

  Await.ready(Future.sequence(scheduleFlights), 10.seconds)

  println(s"Scheduled flights count ${flightScheduler.allScheduledFlights.size} expected $nrFlights")

  def randomFlight(): Flight = {
    val departureTime = Instant.now().plus(Duration.ofMillis(Random.nextInt(24 * 60 * 60 * 1000)))
    val arrivalTime = departureTime.plus(Duration.ofMinutes(Random.nextInt(600)))
    Flight(s"${Random.nextInt(1000)}", departureTime, arrivalTime, Random.nextString(3), Random.nextString(3))
  }
}
