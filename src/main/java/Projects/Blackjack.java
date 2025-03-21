package Projects;

import java.util.Scanner;
import java.util.Random;

class Blackjack {
    public static void main(String[] args) {
	    /* Pseudocode:

        - choose two random cards to start with

        - initialize a card total variable to zero and then add the value of the two cards that were randomly selected
        - print out the total value
        - create a while loop that checks whether the total is greater than or equal to 21
        - in the while loop, if the total equals 21, print "blackjack" and exit. If it's greater than 21, print "busted" and exit
        - Otherwise, print: "Do you want more cards?"
        - if they say no to more cards, exit the while loop*/

        //Choose two random cards to start with
        Random rand = new Random();
        int card1 = rand.nextInt(10 + 1);
        int card2 = rand.nextInt(10 + 1);


        //Create a varible to receive user input
        int cardTotal = card1 + card2;


        Scanner scn = new Scanner(System.in);
        //create a while loop that checks whether the total is greater than or equal to 21
        while(true){
            //Print out cardTotal
            System.out.println("The card total is: " + cardTotal);
            if(cardTotal == 21){
                System.out.println("Blackjack!");
                break;
            }
            if(cardTotal > 21){
                System.out.println("Busted!");
                break;
            }

            //get input from the user
            System.out.println("Do you want more cards?");
            String userInput = scn.nextLine();
            if(userInput.charAt(0) == 'y'){
                int card = rand.nextInt(10 + 1);
                cardTotal = cardTotal + card;
            }else{
                break;
            }


        }
        System.out.print("The card total is: " + cardTotal);
    }
}