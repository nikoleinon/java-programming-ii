
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("matt", "matthew");
        names.put("mix", "michael");
        names.put("artie", "arthur");

        System.out.println(names.get("mix"));
    }

}
