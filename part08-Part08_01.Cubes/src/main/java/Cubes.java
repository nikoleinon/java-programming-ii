
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number");

            String input = scanner.nextLine();

            if (input.equals("end")) {

                break;
            }
            int newInput = Integer.valueOf(input);

            int result = (newInput * newInput) * newInput;

            System.out.println(result);
        }
    }
}
