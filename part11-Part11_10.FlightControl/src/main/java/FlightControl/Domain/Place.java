package FlightControl.Domain;

public class Place {

    private String ID;

    public Place(String ID){
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }
    @Override
    public String toString(){
        return this.ID;
    }
}
