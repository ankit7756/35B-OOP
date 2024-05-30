// 4. Write a java program to Multiply two 2x3 matrices.

package Week6;

public class TD4 {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
     
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
    
        if (cols1 != rows2) {
            System.out.println("Error: Incompatible matrix dimensions for multiplication.");
            return null;
        }
    
        int[][] result = new int[rows1][cols2];
    
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    
        return result;
    }
    
}