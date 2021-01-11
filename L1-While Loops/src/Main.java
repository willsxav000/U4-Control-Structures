import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Random rand = new Random();
        Scanner read = new Scanner(System.in);

        int number = -6;

        while(number < 10){
            System.out.println(number);
            number++;
        }

        System.out.println("Program Ended.");

    }
}
