package BUSRESERVATION;

public class Seats {
    private int seatNo;
    private boolean isbooked;

    public Seats(int seatNo,boolean isbooked){
        this.seatNo = seatNo;
        this.isbooked = isbooked;
    }

    public int getseatNo(){
        return seatNo;
    }
    public boolean isbooked(){
        return isbooked;
    }
    public void setbooked(boolean booked){
        isbooked = booked;
    }
}
