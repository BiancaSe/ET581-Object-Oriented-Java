// Et-581, Homework 1, Exercise 8 - Print each digit separately , Student- Bianca Serpe

import java.util.Scanner;

    public class Exercise1 {

        public static void main(String[] args) {

// 1. Prompt user to enter a 4 digit integer.

            System.out.println("Enter a 4-digit integer:  ");
    
// 2. Read the integer input from the keyboard. extract each digit using / and %

            Scanner scanner = new Scanner(System.in); // I created a variable that stores the integer entered by user
            int number = scanner.nextInt();
            
            System.out.println("First digit: " + number / 1000); // division extracts the first digit 
            System.out.println("Second digit: " + (number % 1000) / 100); // the modulus operation gives the remainder of the first division
                                                                            //and we get the second digit by dividing remainder to 100
            System.out.println("Third digit: " + (number % 100) / 10);   //same as above but we divide remainder by 10 to get 3rd digit
            System.out.println("Fouth digit: " + number % 10); // same as above but we get the fourth digit

scanner.close();





        }
    }









