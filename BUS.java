package BUSRESERVATION;

import java.util.ArrayList;

public class BUS {
    private int BusId;
    private int capacity;
    private boolean ac;
    private ArrayList<Seats> seats;
    public BUS(int ID, int capacity, boolean ac){
        this.BusId = ID;
        this.capacity = capacity;
        this.ac = ac;
        this.seats = new ArrayList<>();
        for(int i = 1; i < capacity; i++){
            this.seats.add(new Seats(i, false));
        }
    }
    public int getBusId(){
        return BusId;
    }
    public ArrayList<Seats> getSeats(){
        return seats;
    }
    public ArrayList<Seats> getAvailableSeats(){
        ArrayList<Seats> availableSeats = new ArrayList<>();
        for(Seats seat : seats){
            if(!seat.isbooked()){
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }
}
