package Projects;
import java.util.Scanner;

public class NumberGuesser {
    public static boolean shouldPlayAgain() {
       System.out.println("Do you want to play again? Your answer should be either y for yes or n for no. ");

        // Read in the user's answer
        Scanner scnr = new Scanner(System.in);
        Character answer = scnr.next().charAt(0);

        if(answer == 'y'){
            return true;
        }else{
            return false;
        }
    }

    //Helper methods
    public static char getUserResponseToGuess(int guess){
       System.out.println("Is it " + guess + " ? [h/l/c]:");

       //Read in the user's answer
       Scanner scnr = new Scanner(System.in);
       Character answer = scnr.next().charAt(0);

       return answer;
    }

    public static int getMidpoint(int low, int high){

       int mid = (low + high)/2;

       return mid;
    }

    //it should implement a complete guessing game on the range of 1 to 100 inclusive
    //both 1 and 100 should be valid guesses for the user to make
    public static void playOneGame() {
       int low = 0;
       int high = 100;


       while(true){
            int guess = getMidpoint(low, high);

            char result = getUserResponseToGuess(guess);

            if(result == 'l'){
                low = guess;


            }else if(result == 'h'){
                high = guess;


            }else{
                break;
            }
       }


    }


    //Main method
    public static void main(String[] args) {
        boolean playAgain = true;

        while (playAgain) {

            playOneGame();

            playAgain = shouldPlayAgain();

        }
    }
}


