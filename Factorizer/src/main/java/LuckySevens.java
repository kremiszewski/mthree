import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    public void playLuckySevens() {

        Random rand = new Random();
        int die1;
        int die2;
        int money;
        int maxMoney;
        int maxMoneyRoll;
        int currentRoll;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many dollars do you have?");
        money = myScanner.nextInt();
        maxMoney = money;
        maxMoneyRoll = 1;
        currentRoll = 1;

        while(money > 0){
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            if(die1 + die2 == 7){
                money += 4;
            }
            else{
                money -= 1;
            }

            if(money > maxMoney){
                maxMoney = money;
                maxMoneyRoll = currentRoll;
            }

            currentRoll++;
        }
        System.out.println("You are broke after " + currentRoll + " rolls.");
        System.out.println("You should have quit after " + maxMoneyRoll + " rolls when you had $" + maxMoney + ".");

    }
}
