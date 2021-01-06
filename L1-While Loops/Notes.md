# Unit 4 - Control Structures

## [L1 Sandbox][sandbox]

## While Loops

A [**loop**](https://www.geeksforgeeks.org/loops-in-java/) is a useful tool for repeating sections of code until a condition is met. This is also known as iterations. 

Loops are also known as **control structures** as they change the natural way that programs execute. Computers execute from the top to the bottom linearly, however loops break that. Loops control the execution of a program, making it repeat sections over again.

There are three main loops, While Loops, Do-While Loops and For Loops. Though each of these are slightly different, they all contain the same three parts; Priming the Loop, Boolean Expression, and Changing the Control variable.

### **Boolean Expression**
To understand the other two parts, we must first understand how the boolean expression works in the loop. As we know, a boolean expression evaluates to either true or false. So in the case of loops, it determines whether to run the loop again, or exit the loop and move on to the next coding section. 

Here is an example of a while loop. Pop over to the [**Sandbox**][sandbox] to run it.
```java
public class Main{
    public static void main(String[] args){
      int number = 1;
      
      while(number < 10){
        System.out.println(number);
        number++;
      }
      
      System.out.println("Program Ended.");
    }
}
```
The boolean expression `number < 10` controls how many times this loop runs. So long as that expression is true, code inside the loop will execute. So on the first iteration `number = 1`,  and so the expression is `true` and so the code, which prints the number to the console and increments it by one, is executed. On the second iteration `number = 2` and the expression is `true` again and thus the code is executed.

The loop will stop whenever the boolean expression is `false` and execution will pass to the statements AFTER the loop block, which in this case prints `Program Ended.` to the console.

### Priming the Loop

The [**control variable**]() of a loop is typically the variable which is used in the boolean expression. So in the example earlier, the control variable is `number` because the value of `number` determines whether the loop will continue or break.

When you [**prime a loop**](), you assign a value to the control variable which makes the boolean expression `true`. In this example, we set `number = 1` so that `number < 10` is true. 

Without a primer, or if the primer sets the expression to `false`,  the while loop will never execute. 

In the [**Sandbox**][sandbox], change the value of number to see the outcomes. What happens if we set number to 10?

### Changing the Control Variable

The most important part of programming loops is to remember to increment or change the control variable such that the boolean expression is `false`. If not, an infinite loop is created.

In the [**Sandbox**][sandbox] delete the `number++` line and run the program. You will notice the line numbers in the console increasing which suggests that the program is printing a new line to the console, but the number isn't changing. This program will never stop. Hit the STOP button (red square) to the left of the console to stop and exit the program.

Since we are in a development environment, we can stop the execution of the program. However, if we were to publish this and send it to clients, they would be unable to stop the program. 

## Exercises

Complete these exercises in the [**Sandbox**][sandbox]. Put the question in comments above the solution.

1. Create a while loop that counts backwards from 10.
2. Create a while loop that outputs every third number from 1 to 30.
3. Create a while loop that assigns a random odd number from 1 to 20 to a variable.
4. Create a while loop that validates a user's password.

[sandbox]: ../L1-While%20Loops/src/Main.java