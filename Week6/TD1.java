// 1. Write a java program to Add two 2x3 matrices

package Week6;

public class TD1 {
    public static void main(String[] args) {
        // Define two 2x3 matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Create a matrix to store the result
        int[][] resultMatrix = new int[2][3];

        // Add the corresponding elements of the two matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
