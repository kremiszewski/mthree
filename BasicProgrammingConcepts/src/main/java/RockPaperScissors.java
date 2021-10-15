import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        boolean play = true;
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();

        while(play){
            int ties = 0;
            int userWins = 0;
            int compWins = 0;

            System.out.println("How many rounds do you want to play?");
            int rounds = myScanner.nextInt();
            if(rounds < 1 || rounds > 10){
                System.out.println("Error: Invalid number of rounds");
                System.exit(1);
            }
            // The game begins here
            for(int i = 0; i < rounds; i++){

                System.out.println("Rock, Paper, or Scissors? Enter 1 for rock, 2 for paper, and 3 for scissors.");
                int userChoice = myScanner.nextInt();
                int outcome = playRound(userChoice, (rand.nextInt(3)+1));
                if(outcome == 0){
                    System.out.println("This round ends in a tie.");
                    ties++;
                }
                else if(outcome == 1){
                    System.out.println("The user wins this round!");
                    userWins++;
                }
                else if(outcome == 2){
                    System.out.println("The computer wins this round!");
                    compWins++;
                }
            }
            // Final results
            System.out.println("Number of ties: " + ties);
            System.out.println("Number of user wins: " + userWins);
            System.out.println("Number of computer wins: " + compWins);

            if(userWins > compWins){
                System.out.println("The user is the winner!!");
            }
            else if(userWins < compWins){
                System.out.println("The computer is the winner!!");
            }
            else{
                System.out.println("And it ends in a tie!");
            }

            System.out.println("Would you like to play again?");
            myScanner.nextLine();
            String input = myScanner.nextLine();
            if(input.equals("No")){
                play = false;
            }
        }
        System.out.println("Thanks for playing!");
    }

    // Rock = 1, Paper = 2, Scissors = 3
    // this method returns a 0 for a tie, a 1 for a user win, and a 2 for a computer win
    static int playRound(int userChoice, int computerChoice){
        int outcome = 0;
        // If its a tie, return 0
        if(userChoice == computerChoice){
            outcome = 0;
        }
        else if(userChoice == 1){
            if(computerChoice == 2){
                outcome = 2;
            }
            else if(computerChoice == 3){
                outcome = 1;
            }
        }
        else if(userChoice == 2){
            if(computerChoice == 1){
                outcome = 1;
            }
            else if(computerChoice == 3){
                outcome = 2;
            }
        }
        else if(userChoice == 3){
            if(computerChoice == 1){
                outcome = 2;
            }
            else if(computerChoice == 2){
                outcome = 1;
            }
        }
        return outcome;
    }
}
