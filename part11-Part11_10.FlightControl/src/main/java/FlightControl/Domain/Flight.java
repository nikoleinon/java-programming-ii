package FlightControl.Domain;

public class Flight {

    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;
    
    public Flight(Airplane airplane, Place departureAirport, Place targetAirport){
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }
    public Airplane getAirplane() {
        return airplane;
    }
    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
    public Place getDepartureAirport() {
        return departureAirport;
    }
    public void setDepartureAirport(Place departureAirport) {
        this.departureAirport = departureAirport;
    }
    public Place getTargetAirport() {
        return targetAirport;
    }
    public void setTargetAirport(Place targetAirport) {
        this.targetAirport = targetAirport;
    }
    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}
