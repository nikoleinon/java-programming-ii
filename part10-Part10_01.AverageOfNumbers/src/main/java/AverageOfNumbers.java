
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true){
            String user = scanner.nextLine();
            if (user.equals("end")){
                break;
            }
            inputs.add(user);
        }

        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
