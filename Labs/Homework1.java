
// Homework 1 Exercise 8 Print Each Digit Separately

import java.util.Scanner;



public class Homework1 {
    public static void main(String[] args) {
        
    
        
// 1. Promt user to enter a 4-digit integer.

System.out.println("Enter a 4-digit integer:  ");

// 2. Read the integer input from keyboard. Extract each digit using / and %.

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();


    int firstDigit = number / 1000;
    int secondDigit = (number % 1000) / 100;
    int thirdDigit = (number % 100) / 10;
    int forthDigit = number % 10;

// 3. Print each digit on a separate line with labels.

    System.out.println("first digit: " + firstDigit);
    System.out.println("second digit: " + secondDigit);
    System.out.println("third digit: " + thirdDigit);
    System.out.println("forth digit: " + forthDigit);


}

}