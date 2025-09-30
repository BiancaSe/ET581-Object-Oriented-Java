// ET  581 Homework 5,  Student: Bianca Serpe 

import java.util.Arrays;

public class JavaHW5 {

    // 1. Max Array - which returns  the largest element in the input array using Math.max()
    public static int maxArray(int[] arr) {
        int max = arr[0];  // Starts with the first element as the max
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);  // Updates max if current element is greater
        }
        return max;  // Return the largest element found
    }

    // Creates and returns a 2D array of size rows x cols filled with random integers from 0 to 100
    public static int[][] createRandom2DArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Assign a random integer between 0 and 100 (inclusive)
                arr[i][j] = (int)(Math.random() * 101);
            }
        }
        return arr;  // Return the filled 2D array
    }

    // Returns the absolute difference between two integers using Math.abs()
    public static int absoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }

    // Swaps the elements at index1 and index2 in the given array
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];  // Temporarily store element at index1
        arr[index1] = arr[index2];  // Assign element at index2 to index1
        arr[index2] = temp;  // Assign stored element to index2
    }

    // Main method to test the above functions
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        System.out.println(maxArray(numbers));  // Should print the max value: 89

        // Create a 3x4 2D array with random values and print each row
        int[][] randomArray = createRandom2DArray(3, 4);
        for (int[] row : randomArray) {
            System.out.println(Arrays.toString(row));
        }

        // Test absoluteDifference method with sample inputs
        System.out.println(absoluteDifference(15, 27));  // Output: 12
        System.out.println(absoluteDifference(30, 10));  // Output: 20

        // Test swap method by swapping elements at index 1 and 3
        int[] swapNumbers = {10, 20, 30, 40, 50};
        swap(swapNumbers, 1, 3);
        System.out.println(Arrays.toString(swapNumbers));  // Should print: [10, 40, 30, 20, 50]
    }
}

