package src;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows and columns for matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        System.out.println("Enter Matrix 1 elements:");
        readMatrix(scanner, matrix1, rows, cols);
        
        System.out.println("Enter Matrix 2 elements:");
        readMatrix(scanner, matrix2, rows, cols);
        
        System.out.println("Addition:");
        printMatrix(addMatrices(matrix1, matrix2, rows, cols));
        
        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2, rows, cols));
        
        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2, rows, cols));
        
        scanner.close();
    }
    
    private static void readMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    private static int[][] addMatrices(int[][] m1, int[][] m2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
    
    private static int[][] subtractMatrices(int[][] m1, int[][] m2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }
    
    private static int[][] multiplyMatrices(int[][] m1, int[][] m2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
