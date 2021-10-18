import java.util.Scanner;

public class InterestCalculator {

    public void calculateInterest() {

        int years = 0;
        float interestRate = 0;
        float amount = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How much do you want to invest?");
        amount = myScanner.nextFloat();

        System.out.println("How many years are you investing for?");
        years = myScanner.nextInt();

        System.out.println("What is the annual interest % rate?");
        interestRate = myScanner.nextFloat();

        System.out.println("Calculating...");
        float quarterlyInterestRate = interestRate/4;
        float earned;
        float initialAmount;

        for(int i = 1; i <= years; i++){
            earned = 0;
            initialAmount = amount;
            System.out.println("Year " + i + ": ");
            System.out.print("Began with $");
            System.out.printf("%.2f \n", amount);
            for(int j = 0; j < 4; j++){
                amount = amount * (1 + (quarterlyInterestRate/100));
            }

            System.out.print("Earned $");
            System.out.printf("%.2f \n" , (amount - initialAmount));
            System.out.print("Ended with $");
            System.out.printf("%.2f \n", amount);
            System.out.println();

        }

    }
}
