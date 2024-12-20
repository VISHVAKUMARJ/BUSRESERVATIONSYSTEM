package BUSRESERVATION;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
public class BusDemo {
    public static void main(String[] args){
        route Route = new route("R1", "CityA", "CityB", List.of("CityA", "Stop1", "CityB"));
        BUS bus = new BUS(111, 5, true);

        passenger user = new passenger("Vishva", 24, "Male");

        BookingService bookingService = new BookingService();

        // Book a seat
        bookingService.createBooking(bus, user, 1);
        bookingService.createBooking(bus, user, 2); // Attempt to re-book the same seat

        // Display available seats
        System.out.println("Available Seats: ");
        for (Seats seat : bus.getAvailableSeats()) {
            System.out.println("Seat " + seat.getseatNo());
        }
//        int opt = 1;
//        while(opt == 1){
//            System.out.println("Press 1 for Booking");
//            System.out.println("press 2 for exit");
//            Scanner scanner = new Scanner(System.in);
//            opt = scanner.nextInt();
//            if(opt == 1){
//                System.out.println("Booked..");
//            }else{
//                System.out.println("exit");
//            }
//        }
    }
}
