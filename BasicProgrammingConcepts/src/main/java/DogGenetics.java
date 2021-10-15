import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String dogName = myScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();
        System.out.println(dogName + " is:");

        int breed1 = rand.nextInt(100-4)+1;
        int breed2 = rand.nextInt(100-breed1-3)+1;
        int breed3 = rand.nextInt(100-breed1-breed2-2)+1;
        int breed4 = rand.nextInt(100-breed1-breed2-breed3-1)+1;
        int breed5 = 100-breed1-breed2-breed3-breed4;

        System.out.println(breed1 + "% German Shepherd");
        System.out.println(breed2 + "% Shiba Inu");
        System.out.println(breed3 + "% Border Collie");
        System.out.println(breed4 + "% American Pit Bull Terrier");
        System.out.println(breed5 + "% Rottweiler");
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}
