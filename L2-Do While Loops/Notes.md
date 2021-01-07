# Unit 4 - Control Structures

## [L2 Sandbox][sandbox]

## Do While Loops

The second type of loop is a Do-While loop, which is just slightly different from the While Loop.

Lets look at an example in the [**Sandbox**][sandbox].

```java
public class Main {

    public static void main(String[] args) {
        int number = 1;

        do{
            System.out.println(number);
            number++;
        }while(number < 10);
    }
}
```
You will notice that a Do-While has a primer (`int number = 1`), a boolean expression (`number < 10`) and a change to the control variable (`number++`). 

### Pre-test vs. Post-test Loops

The While Loop and Do-While Loop are very similar, but they have 1 significant difference. A Do-While Loop is a post-test loop, which means it evaluates the boolean expression AFTER executing the code block. A While loop is a pre-test loop, which evaluates the boolean expression BEFORE executing the code block. 

In a more simplified explanation, a Do-While Loop executes its code block once before attempting to loop again where a While Loop may not execute at all depending on the value of the control variable. 

### Do-while vs. While Loops

Let's look at what these loops look like in difference situations. 

### Situation 1: Validating User Input
Prompt the user to enter a number between 1 and 5. If a user enters a number outside that range, prompt them to enter again.

**WHILE LOOP**
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner read = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 5");
        number = read.nextInt();

        while(number < 1 && number > 5){
            System.out.println("Please enter a number from 1 to 5");
            number = read.nextInt();
        }
        
        System.out.println("You entered " + number);
    }
}
```
**DO WHILE LOOP**
```java
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
```
For this program, we want the user to enter a number at least once. It makes sense in this case to use a Do-While loop. However, if you to tell the user they've entered the number wrong, the programs change slightly. 

**WHILE LOOP**
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner read = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 5");
        number = read.nextInt();

        while(number < 1 || number > 5){
            System.out.println("Invalid Input.");
            System.out.println("Please enter a number from 1 to 5");
            number = read.nextInt();
        }
        
        System.out.println("You entered " + number);
    }
}
```
**DO WHILE LOOP**
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner read = new Scanner(System.in);

        do{
            System.out.println("Please enter a number from 1 to 5");
            number = read.nextInt();
            if(number < 1 || number > 5){
                System.out.println("Invalid Input.");
            }
        }while(number < 1 || number > 5);
        
        System.out.println("You entered " + number);
    }
}
```
Even though these two program will output the exact same, their logic and execution is slightly different. Bear this in mind when deciding whether to use a Do-while or a While loop. 

### Situation 2: Game Loop
It is most effective to use a Do-while loop for a game loop as you want the player to play the game at least once, or complete a round in the game at least once. 

However in some games, like a High-Low Guessing Game, a While loop might be used to loop through the guesses and a Do-while loop might be used to repeat the game. 

## Exercises
1. Create a do-while loop that counts backwards from 10.
2. Create a do-while loop that outputs every third number from 1 to 30.
3. Create a do-while loop that assigns a random odd number from 1 to 20 to a variable.
4. Create a do-while loop that validates a user's password.


[sandbox]: ../L2-Do%20While%20Loops/src/Main.java