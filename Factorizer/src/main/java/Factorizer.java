import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {

        int numFactors = 2;
        int perfectNumber = 1;

        System.out.println("What number would you like to factor?");

        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();

        System.out.println("The factors of " + num + " are:");
        System.out.print("1 ");
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                numFactors++;
                perfectNumber += i;

            }
        }
        System.out.print(num + "\n");
        System.out.println(num + " has " + numFactors + " factors.");
        if(perfectNumber == num){
            System.out.println(num + " is a perfect number.");
        }
        else{
            System.out.println(num + " is not a perfect number.");
        }
        if(numFactors == 2){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }


    }
}
