import java.util.Random;

public class WaitAWhile {

    public static void main(String[] args) {

        int counter = 1;
        int percentChance = 10;
        Random randomizer = new Random();
        boolean roomCleaned = false;
        do{
            if(randomizer.nextInt(100) < percentChance){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                roomCleaned = true;
            }
            else {
                System.out.println("Clean your room!! (x" + counter + ")");
                if (counter == 7) {
                    System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND IM TAKING YOUR XBOX!");
                    break;
                }
            }
            percentChance += 10;
            counter++;

        }while(!roomCleaned);
    }
}
