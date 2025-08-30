// Et-581, Homework 1, Exercise 10 - Calculate  , Student- Bianca Serpe

import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //craeted the scanner object that takes the user input

// 1. Prompt user to enter a number of seconds.
        
        System.out.println("Enter the number of seconds:  "); 
        int totalSeconds = scanner.nextInt(); //I created a variable that stores the imteger entered by user

// 2. Calculate hours, minutes and seconds.

        int hours = totalSeconds / 3600; //calculates the number of hours by dividing totalSeconds by 3600 (1hr=3600s)
        int minutes = (totalSeconds % 3600) / 60; //using the % modulus operation to calculate the remainder of seconds after the full hours
        int seconds = totalSeconds % 60; 

// 3. Display the results.
        
System.out.print(totalSeconds + "seconds= " + hours + " hour(s), "   + minutes + " minute(s) and "  + seconds + " second(s)");

scanner.close();
}
}