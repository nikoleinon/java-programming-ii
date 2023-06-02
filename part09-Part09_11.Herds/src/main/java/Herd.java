import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy){
        for (Movable moving : herd){
            moving.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Movable movable : herd) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }
}
