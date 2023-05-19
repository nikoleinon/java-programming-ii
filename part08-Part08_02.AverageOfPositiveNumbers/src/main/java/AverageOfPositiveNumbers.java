
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Input a number");
            int input = scanner.nextInt();

            if (input == 0) {

                if (sum > 0) {
                    double result = 1.0 * sum/count;
                    System.out.println("Average: " + result);

                } else {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }

            if (input > 0) {
                sum += input;
                count++;

            }
        }
    }
}
