import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("I can't decide what animal I like best! ill let Random decide for me!");

        int x = randomizer.nextInt(6);

        System.out.println("The number we chose was " + x);

        switch(x){
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Wooly mammoths are DEFINITELY the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest!");
                break;
            case 4:
                System.out.println("Cockatoos are just so awesome!");
                break;
            case 5:
                System.out.println("Naked mole rat for the win.");
                break;
        }
        System.out.println("Thanks random, youre the best!");

    }
}
