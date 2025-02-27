package Projects;


import java.util.Scanner;
import java.util.Arrays;


class PokerHands {

    class Main {
        public static void main(String[] args) {

            //specify the size of the array
            int[] numbers = new int[5];

            // Read in the user's numbers and add them to the array
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }


            boolean isItIncreasing = true;
            boolean pairs = false;
            // Sort the array first and then compare each item in the array to
            // its neighbor
            Arrays.sort(numbers);
            //check for pairs
            for(int i = 1; i < numbers.length; i++){
                if (numbers[i] == numbers[i - 1]) {
                    pairs = true;
                }

                if(isItIncreasing && numbers[i] == numbers[i - 1] + 1){
                    isItIncreasing = true;
                }else{
                    isItIncreasing = false;
                }
            }

            if(isItIncreasing){
                System.out.println("Straight!");
            }
            if(pairs){
                System.out.println("Pair!");
            }
        }
    }
}