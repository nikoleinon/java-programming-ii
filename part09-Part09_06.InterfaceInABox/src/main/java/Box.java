import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> boxed;

    public Box(double capacity){
        this.capacity = capacity;
        this.boxed = new ArrayList<>();
    }

    public void add(Packable tobox){
        if (this.weight() + tobox.weight() <= capacity){
            boxed.add(tobox);
        }
    }
    @Override
    public double weight() {
        double sum = 0;

        for (Packable p : boxed){
            sum += p.weight();
        }
        return sum;
    }
    @Override
    public String toString(){
        return "Box: " + boxed.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
