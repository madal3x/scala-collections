package immutable.map

import scala.collection.immutable.TreeMap
import scala.util.Random

object flight extends App {
  type Passenger = String

  case class Flight(id: String, seats: TreeMap[Int, Passenger] = TreeMap.empty) {
    def bookSeat(seatNumber: Int, passengerName: String): Flight = {
      if (seats.contains(seatNumber)) {
        this // Seat already booked, return the flight unchanged
      } else {
        val updatedSeats = seats + (seatNumber -> passengerName)
        this.copy(seats = updatedSeats)
      }
    }

    def passengersWithSeatsInRange(from: Int, to: Int): Iterable[Passenger] = {
      seats.range(from, to).values
    }
  }

  val flight = (100 to 1 by -1)
    .map(seat => (seat, Random.nextString(5)))
    .foldLeft(Flight("AA123")) {
      case (flight, (seatNumber, passenger)) =>
        flight.bookSeat(seatNumber, passenger)
    }

  println(flight.seats.size)
}
