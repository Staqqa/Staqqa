import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main (String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
    

        //random nummer er valgt = 18

        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){

        Scanner scanner = new Scanner (System.in);
        boolean stillLooping = true;

        if(scanner.hasNextInt()) {
            while(stillLooping) {
            int number = scanner.nextInt();


            if(number < rnd_number){

                System.out.println("your number is too low"); 
            }

            else if(number > rnd_number){
                System.out.println("your number is too high");
            }

            else {
                System.out.println("Congratiulations you found the number!");
                stillLooping = false;

            }
        }

        } else {
            System.out.println("We want numbers Bruh");
            makeAGuess();
        }


    }


		// Create a Scanner object 	(DONE)
    	// Read user input

        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

}

