package domain.flightBook

import scala.collection.immutable.TreeMap

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
