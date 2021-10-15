import java.sql.SQLOutput;
import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {

        float height = 0;
        float width = 0;

        float costWindow = 0;
        float costTrim = 0;

        int numOfWindows = 0;

        String stringHeight = null;
        String stringWidth = null;

        String stringCostWindow = null;
        String stringCostTrim = null;

        String stringNumOfWindows = null;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);

        //Get input from the user
        try {
            System.out.println("Please enter window height: ");
            stringHeight = myScanner.nextLine();
            System.out.println("Please enter window width: ");
            stringWidth = myScanner.nextLine();
            System.out.println("Please enter the price for the window glass per square foot: ");
            stringCostWindow = myScanner.nextLine();
            System.out.println("Please enter the price for the window trim per linear foot: ");
            stringCostTrim = myScanner.nextLine();
            System.out.println("Please enter the number of windows needed: ");
            stringNumOfWindows = myScanner.nextLine();

        // Convert strings to floats
            height = Float.parseFloat(stringHeight);
            width = Float.parseFloat(stringWidth);
            costWindow = Float.parseFloat(stringCostWindow);
            costTrim = Float.parseFloat(stringCostTrim);
            numOfWindows = Integer.parseInt(stringNumOfWindows);
        } catch (NumberFormatException ex) {
            System.out.println("Input could not be processed.");
            System.exit(1);
        }

        // Calculate the area of the window
        areaOfWindow = height * width;

        // Calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // Calculate total cost
        cost = ((costWindow * areaOfWindow) + (costTrim * perimeterOfWindow)) * numOfWindows;

        // Display results to the user
        System.out.println("Window Height: " + stringHeight);
        System.out.println("Window Width: " + stringWidth);
        System.out.println("Window Area: " + areaOfWindow);
        System.out.println("Window Perimeter: " + perimeterOfWindow);
        System.out.print("Total Cost: ");
        System.out.printf("%.2f", cost);



    }
}
