
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> prints = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                String output = prints.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
                System.out.println(output);

                break;
            }
            prints.add(input);
        }
    }
}
