package BUSRESERVATION;
import java.util.List;
public class route {
    private String Source;
    private String Destination;
    private String routeId;
    private List<String> stops;

    public route(String routeId,String Source, String Destination,List<String> stops){
        this.routeId = routeId;
        this.Source = Source;
        this.Destination = Destination;
        this.stops = stops;
    }
    public String getRouteId(){
        return routeId;
    }
    public List<String> getStops(){
        return stops;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }
}
