package immutable.map

import domain.flightBook._

import scala.util.Random

object FlightBookTreeMap extends App {
  type Passenger = String

  val flight = (100 to 1 by -1)
    .map(seat => (seat, Random.nextString(5)))
    .foldLeft(Flight("AA123")) {
      case (flight, (seatNumber, passenger)) =>
        flight.bookSeat(seatNumber, passenger)
    }

  println(flight.seats.size)
}
