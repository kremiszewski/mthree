import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = myScanner.nextInt();

        int maxHeartRate = 220 - age;
        float targetLowFloat = maxHeartRate * 0.5f;
        float targetHighFloat = maxHeartRate * 0.85f;
        int targetLow = Math.round(targetLowFloat);
        int targetHigh = Math.round(targetHighFloat);

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + targetLow + " - " + targetHigh + " beats per minute.");

    }
}
