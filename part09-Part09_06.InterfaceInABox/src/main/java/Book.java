public class Book implements Packable {
    private String author;
    private String name;
    private Double weight;

    public Book (String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        return author + ": " + name;
    }

}
