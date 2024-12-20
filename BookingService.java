package BUSRESERVATION;

public class BookingService {
   public reserve createBooking(BUS bus, passenger user, int seatNumber){
            Seats seat = bus.getSeats().get(seatNumber - 1);
            if (seat.isbooked()){
                System.out.println("Seat is Already Booked");
                return null;
            }
            seat.setbooked(true);
            reserve booking = new reserve(bus,user,seatNumber);
            System.out.println("Booking is Successfull");
            return booking;
   }
}
