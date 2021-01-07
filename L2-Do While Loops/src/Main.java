import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner read = new Scanner(System.in);

        do{
            System.out.println("Please enter a number from 1 to 5");
            number = read.nextInt();
        }while(number < 1 && number > 5);

        System.out.println("You entered " + number);
    }
}
