// ET 581 Homework 4,  2D array & nested loops. Part 2:Calculate and print the sum of each column  Student: Bianca Serpe

// 2D array initialization and declaration; 3x4 matrix(3 rows , 4 columns)
public class ColumnSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
// Sum of each column; all values of each column are added & sum is printed
        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            System.out.println("Sum of column " + col + ": " + sum);
        }
    }
}
