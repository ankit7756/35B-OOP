// 3. Write a java program to print mirror 2X2 matrices.

package Week6;

public class TD3 {
    public static void main(String[] args) {
        // Define the 2x2 matrix
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        // Create a matrix to store the mirrored result
        int[][] mirroredMatrix = new int[2][2];

        // Mirror the matrix by swapping elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mirroredMatrix[i][j] = matrix[i][1 - j];
            }
        }

        // Print the mirrored matrix
        System.out.println("Mirrored Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mirroredMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
