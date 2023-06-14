import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private List<T> hideout;

    public Hideout(){
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide){
        if (!hideout.isEmpty()) {
            hideout.clear();
        }
        this.hideout.add(toHide);
    }
    public T takeFromHideout(){
        T value = hideout.get(0);
        hideout.clear();
        return value;
    }
    public boolean isInHideout(){
        if (hideout.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
}
