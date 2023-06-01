public class CD implements Packable {
    private String name;
    private int year;
    private String artist;
    private Double weight = 0.1;

    public CD (String artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight();
    }


    public String getArtist() {
        return artist;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public Double getWeight() {
        return weight;
    }


    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public double weight() {
        return this.weight;
    }
    @Override
    public String toString(){
        return artist + ": " + name + " (" + year + ")";
    }
    
}
