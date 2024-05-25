package immutable.map.domain

import immutable.map.domain.FlightSchedulerTreeMap.DepartureTimeRange

import java.time.Instant
import scala.collection.immutable.TreeMap

class FlightSchedulerTreeMap {
  implicit val flightOrdering: Ordering[DepartureTime] = Ordering.by(_.getEpochSecond)

  private var flights: TreeMap[DepartureTime, Flight] = TreeMap.empty

  def scheduleFlight(flight: Flight): Unit = {
    flights = flights + (flight.departureTime -> flight)
  }

  def nextFlight: Option[Flight] =
    flights.headOption.map { case (_, flight) => flight }

  def flightsInRange(departureTimeRange: DepartureTimeRange): Iterable[Flight] = {
    flights.range(departureTimeRange.start, departureTimeRange.end).values
  }

  def allScheduledFlights: Iterable[Flight] = flights.values
}

object FlightSchedulerTreeMap {
  case class DepartureTimeRange(start: Instant, end: Instant)
}