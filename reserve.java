package BUSRESERVATION;

public class reserve {
    private static int bookingId = 1000;
    private BUS bus;
    private passenger user;
    private int seatNumber;

    public reserve(BUS bus, passenger user, int seatNumber){
        this.bus = bus;
        this.user = user;
        this.seatNumber = seatNumber;
    }

    public int getBookingId() {
        return bookingId++;
    }

    public BUS getBus() {
        return bus;
    }

    public passenger getUser() {
        return user;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
