import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        Random rand = new Random();

        /*int number = -6;

        while(number < 10){
            System.out.println(number);
            number++;
        }

        System.out.println("Program Ended.");*/

        //Create a while loop that counts backwards from 10.
        /*int number = 10;

        while(number > 0){
            System.out.println(number);
            number--;
        }*/

        //Create a while loop that outputs every third number from 1 to 30.

        /*int number = 1;

        while(number < 30){

            System.out.println(number);
            number += 3;
        }*/

        //Create a while loop that assigns a random odd number from 1 to 20 to a variable.

        /*int number = rand.nextInt(19) + 1;

        while(number%2 == 0){
            number = rand.nextInt(19)+1;
        }

        System.out.println(number);*/

        //Create a while loop that validates a user's password.
        String password = "Krusty Krab";

        System.out.println("Please enter you password:");
        String userGuess = read.nextLine();

        while(!password.equals(userGuess)){

            System.out.println("Please enter you password:");
            userGuess = read.nextLine();
        }
    }
}