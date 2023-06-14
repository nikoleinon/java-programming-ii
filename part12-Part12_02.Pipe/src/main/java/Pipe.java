import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        T value = pipe.get(0);
        pipe.remove(0);
        return value;
    }

    public boolean isInPipe() {
        if (pipe.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
