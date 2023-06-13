package FlightControl;

import java.util.Scanner;

import FlightControl.Logic.FlightControl;
import FlightControl.Ui.TextUI;

public class Main {

    public static void main(String[] args) {
        FlightControl testFC = new FlightControl();
        Scanner sc = new Scanner(System.in);
                
                TextUI ui = new TextUI(testFC, sc);
                
                ui.start();    
            }
}
