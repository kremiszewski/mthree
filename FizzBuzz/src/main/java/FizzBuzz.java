import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner myScanner = new Scanner(System.in);

        int count = myScanner.nextInt();

        System.out.println("0");
        for(int i=1; count>0; i++){
            if(i!=0){
                if(i%15==0){
                    System.out.println("fizz buzz");
                    count--;
                    continue;
                }
                else if(i%5==0){
                    System.out.println("buzz");
                    count--;
                }
                else if(i%3==0){
                    System.out.println("fizz");
                    count--;
                }
                else{
                    System.out.println(i);
                }
            }


        }
        System.out.println("TRADITION!!!!!");
    }
}
