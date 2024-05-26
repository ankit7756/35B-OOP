// 2. Write a java program to print transpose 2X2 matrices.

package Week6;

public class TD2 {
    public static void main(String[] args) {
        // Define a 2x2 matrix
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        // Create a 2x2 matrix to store the transpose
        int[][] transpose = new int[2][2];

        // Compute the transpose of the matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Same program with an additional method to print the result matrices:

// public class TD2 {
//     public static void main(String[] args) {
//         // Define a 2x2 matrix
//         int[][] matrix = {
//             {1, 2},
//             {3, 4}
//         };

//         // Create a 2x2 matrix to store the transpose
//         int[][] transpose = new int[2][2];

//         // Compute the transpose of the matrix
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 transpose[i][j] = matrix[j][i];
//             }
//         }

//         // Print the original matrix
//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         // Print the transposed matrix
//         System.out.println("Transposed Matrix:");
//         printMatrix(transpose);
//     }

//     // Helper method to print a 2x2 matrix
//     public static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
