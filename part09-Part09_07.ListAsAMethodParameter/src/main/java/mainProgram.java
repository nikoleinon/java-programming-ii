import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        
        System.out.println(returnSize(names));
    }

    private static int returnSize(List<String> names) {
        return names.size();
    }
}
