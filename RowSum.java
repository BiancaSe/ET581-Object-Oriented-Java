//ET 581 HW 4- 2D array & nested loops,Part 1: Row Sum.  Student: Bianca Serpe

public class RowSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            System.out.println("Sum of row " + row + ": " + sum);
        }
    }
}
