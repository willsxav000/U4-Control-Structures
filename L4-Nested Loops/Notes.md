# Unit 4 - Control Structures

## [L1 Sandbox][sandbox]

## Nested Loops

There are situations in which one loop isn't enough. For example, you want to create an odometer (the thing that tracks miles driven in a car), or other digital counters. 

![](https://codemyui.com/wp-content/uploads/2015/12/simple-flipping-counter.gif)

In this example you will see that the seconds tick down. One COULD read this as 22, 21, 20, 19, 18. However, a better way to consider counting is by place values. The ones place value of the seconds is counting down from 2 and starting over at 0. When is starts over, the tens place value goes down a number as well.

We can use nested loops to simulate this type of counting. Just like in nested if-statements, there is an outer loop and an inner loop.

Let's start with a smaller example and use the [**Sandbox**][sandbox] to create this output: 

```
****
****
****
```

The only condition is that you can only print one '*' at a time, meaning that one `println` with "****" isn't in the nature of this problem.

Here is the code in its entirety.

```java
public class Main{
    public static void main(String[] args) {
        
        int ROW = 3, COL = 4;
        
        for(int i = 0; i < ROW;i++){
            for(int j = 0; j < COL; j++){
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}
```

Firstly, since we know how many times each loop will run, based on the number of asterisks, we can use For loops. Notice how we make a grid or table of asterisks. You can think of this grid has having ROWS and COLUMNS. So there are three rows (0, 1, 2) and 4 columns (* * * *).

To help visualize this, run this code in the [**Sandbox**][sandbox]

```java
public class Main{
    public static void main(String[] args) {

        int ROW = 3, COL = 4;

        for(int i = 0; i < ROW;i++){
            for(int j = 0; j < COL; j++){
                System.out.print("(i=" + i + ", j=" + j + ")  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
```
You can see that the outer loop, the i's, determines the row. Or in other words, for each i, we loop through all possible j's. The inner loop, the j-loop, prints 1 output each time it loops. 

The inner loop must complete its iterations BEFORE the outer loop continues its iterations. So the flow of execution enters the outer loop and tests the boolean expression, which is true so executes the code block, which is another loop and two `println` statements.  The flow of execution passes to the inner loop, which must run in its entirety before the flow of execution passes out of the inner loop and finishes the outer loop code block, then iterates the outerloop. 

This all sounds entirely too complicated, but let's make that counter as shown in the .gif and let's just do a countdown from 99 to 0. 

Follow along with me in the [**Sandbox**][sandbox]

## Exercises

1. Create the following output
```
   ****
   ***
   **
   *
```
2. Create a multiplication table from 1 to 10. 
3. Create the following output: 
```
1   2   3   4
5   6   7   8
9   10  11  12
```




[sandbox]: ../L4-Nested%20Loops/src/Main.java