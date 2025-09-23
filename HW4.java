// ET 581 Homework 4,  2D array & nested loops.  Student: Bianca Serpe 

/*Importing the StringTokenizer class which is used in the code to split 
the string Hello World*/

import java.util.StringTokenizer;

public class HW4 {         //Defining the public class, the main container for the code
    public static void main(String[] args) {

        // 2D array initialization and declaration; 3x4 matrix(3 rows , 4 columns)
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // 1. Sum of each row; all values in each row are added & the sum is printed
        for (int row = 0; row < arr.length; row++) {  //Outer loop iterating through each row
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) { //Inner loop going through each column
                sum += arr[row][col];
            }
            System.out.println("Sum of row " + row + ": " + sum);
        }

        // 2. Sum of each column; all values of each column are added & sum is printed
        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            System.out.println("Sum of column " + col + ": " + sum);
        }

        // 3. Reverse each word in a sentence
        String greeting = "Hello World"; //declaring & initializing a string var
        StringTokenizer tokenizer = new StringTokenizer(greeting); //using a ST to split string into words/tokens

        while (tokenizer.hasMoreTokens()) {  /* while loop to run trough all tokens; picked this one
             becuase it's simple & stops when no more words */

            String word = tokenizer.nextToken();
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}

