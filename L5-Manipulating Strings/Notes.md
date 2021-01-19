# Unit 4 - Control Structures

## [L5 Sandbox][sandbox]

## Manipulating Strings

Loops are very helpful when dealing with strings and manipulating String output. There isn't any NEW notes we need to add, but let's quickly review our String methods: 


String	**replace(char oldChar, char newChar)** - replaces the first parameter with the second

String	**toLowerCase()** - replaces all characters with Lowercase equivalents

String	**toUpperCase()** - replaces all characters with Uppercase equivalents

String	**trim()** - removes whitespace before and after the String

int	**indexOf(String str)*** - returns the index of the first occurrence of String parameter

int	**length()*** - returns the number of characters in the String

String	**substring(int beginIndex)** - Returns the substring beginning at beginIndex and ending at .length(), exclusive

String	**substring(int beginIndex, int endIndex)** - Returns the substring beginning at beginIndex and ending at endIndex, exclusive

char **charAt(int index)** - returns the first occurrence of the character at the give index value

boolean	**equals(Object anObject)**

boolean **equalsIgnoreCase**

boolean	**contains(CharSequence s)**

int	**compareTo(String anotherString)**
* returns a value < 0 if object is less than the parameter
* returns 0 if object is equal to the parameter
* returns a value > 0 if object is greater than the parameter

The best way to learn is to work on some exercises. 

## Exercises

1. Given a string, return a string where for every char in the original, there are two chars.

2. Return the number of times that the string "hi" appears anywhere in the given string.

3. Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

```java
repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
```




[sandbox]: ../L5-Manipulating%20Strings/src/Main.java
