
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String user = scanner.nextLine();
            if (user.equals("end")) {
                System.out.println("Print the average of the negative number or the positive number? (n/p)");
                String userInput = scanner.nextLine();

                if (userInput.equals("n")) {

                    double averagen = inputs.stream().mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble();

                    System.out.println("average of the negative numbers: " + averagen);
                }

                if (userInput.equals("p")) {

                    double averagep = inputs.stream().mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i > 0)
                            .average()
                            .getAsDouble();

                    System.out.println("average of the positive numbers: " + averagep);
                }
                break;
            }
            inputs.add(user);
        }

    }
}
