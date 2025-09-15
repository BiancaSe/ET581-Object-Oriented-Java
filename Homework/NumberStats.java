import java.util.Scanner;

public class NumberStats {          // declaring the public class 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // creating the scanner for reading user input

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();  //Reads the integer value entered by the user and stores it in variable n.

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");  /* validation check. 
                                                                    If the user enters 0 or a negative number,
                                                                     it prints a message and stops the program using 'return' */
                                                                        
        return;
        }

        int[] numbers = new int[n];  // Declaring an array of integers; this will store the user's numbers.

        // Prompt the user to enter the integers
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {       /*A for loop that runs n times, each time reading 
                                            an integer from the user and storing it in the array.*/
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = (double) sum / n;

        // Print results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        scanner.close();
    }
}

