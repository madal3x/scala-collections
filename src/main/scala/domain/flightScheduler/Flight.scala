package domain.flightScheduler

import java.time.Duration

case class Flight(flightNumber: String,
                  departureTime: DepartureTime,
                  arrivalTime: ArrivalTime,
                  origin: String,
                  destination: String)
{
  lazy val duration: Duration = Duration.between(departureTime, arrivalTime)
}
