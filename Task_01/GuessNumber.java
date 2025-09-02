import java.util.*;
import java.util.Random;

public class GuessNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        // create random class object
        Random random = new Random();

     
       int TotalScore = 0;
       boolean playAgain = true;

       while(playAgain){
        int numberToGuess = random.nextInt(100);
        int maxAttempts = 7; // attempts limit
        int attempts = 0; // number of attempts
        boolean guessedCorrectly = false;

        System.out.println("Think of a number  between 1 to 100");
        System.out.println("You have 7 attempts to guess it");

        while(attempts!=maxAttempts){
            System.out.print("Enter your guess number: ");
            int userGuess = input.nextInt();
            attempts++;

            if(userGuess==numberToGuess){
                System.out.println("Correct! You guess the number in "+attempts+" attempts");
                TotalScore++;
                guessedCorrectly = true;
            }else if(userGuess<numberToGuess){
                System.out.println("Too low! Try Again.");
            }else{
                System.out.println("Too high! Try Again");
            }
        }

        if(!guessedCorrectly){
            System.out.println("You've used all attempts. The number was "+numberToGuess);
        }

        System.out.println("Your current score: "+TotalScore);

        // ask for another round
        System.out.println("Do you want to play again? (yes/no)");
        String response = input.next();
        playAgain = response.equals("yes");
       }

       System.out.println("Thanks for playing! Your final score: "+TotalScore);
    }
    
}
