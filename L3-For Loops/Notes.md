# Unit 4 - Control Structures

## [L3 Sandbox][sandbox]

## For Loops

A [**For Loop**](https://www.programiz.com/java-programming/for-loop) has the same three parts as the While and Do-While loops, but its syntax (the way you write it) is very different. 

A For Loop takes all three parts and condenses them into one statement. Run this example in the [**Sandbox**][sandbox]

```java
public class Main{
    public static void main(String[] args) {
        
        for(int number = 1; number < 10; number++){
            System.out.println(number);
        }
    }
}
```

You will see that the For Loop does the same thing as the While and Do-While loops, but condenses the programming down to include the primer, boolean expression and changing of the control variable all in one statement. A generalized form of this is:

```
for(primer; boolean expression; control variable update){ 
    code to execute ... 
}
```
Notice how we still initialize the control variable and state its data-type. Also notice there is a semi-colon between each statement. 

### The i's have it!

The one thing that makes For Loops more confusing than the others is the use of `i`, `j` and `k` as control variables. `i` was originally used to indicate **index** as for loops are commonly used with arrays and Strings. However, as the usage become more complex, more variables were needed to access index values, which we will see when we talk about nested loops. 

Copy/Paste the code below into the [**Sandbox**][sandbox] to see what it does. 

```java
public class Main{
    public static void main(String[] args) {
        String word = "Programming";
        
        for(int i = 0; i < word.length(); i+=2){
            System.out.print(word.charAt(i));
        }
        
        System.out.println();
    }
}
```
We can see here how `i` is being used to access the index of the characters in the word. Also notice how we change the control variable. Instead of `++` we use `+=2` to get every other letter. `print` is used in the loop so that the letters are written linearly, then a `println`is used after the loop to start a new line in the console.

The control variable can also be used inside the loop itself. For example, we can output a times table very quickly with a for loop. 

Copy/Paste the code below into the [**Sandbox**][sandbox].

```java
for(int i = 2; i < 10; i++){
    System.out.println(i*2);
}
```

### When To Use It

Let's recap when to use what loop: 

* Do-while - when the code section needs to execute at least once, but the end of the loop is unknown. 
* While - when the code section needs to repeat, but you are not sure how many times or even if it needs to run at all.
* For - when the code section needs to execute and you know exactly how many times the loop will execute. 

Examples: 

Validating User Input - Do-While - we expect the user to enter information at least once, but we aren't sure how many times it will take them before they get it right.

Object Data - While Loop - Not every object has the same data. For example, if you wanted to print out all the AP classes a student has. Not every student has had an AP class, and you don't know how many AP classes a student has taken. You would use a While loop to output all or none of the AP classes.

Counting - For Loop - Many programs need some kind of counting mechanism. You deal 5 cards, you average 10 scores. For loops are best for this since you know how many times the program will execute.

## Exercises

1. Create a for loop that counts backwards from 10.
2. Create a for loop that outputs every third number from 1 to 30.
3. Create a for loop that creates 10 random odd numbers from 1 to 20.
4. Create a for loop that calculates the average of 10 scores. (hint: when would you divide?)

[sandbox]: ../L3-For%20Loops/src/Main.java
