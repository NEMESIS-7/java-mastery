package reynolds32896;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Algorithms Console!");
            System.out.println("Please select an operation:");
            System.out.println("1. Sequential Search");
            System.out.println("2. Maximum Element");
            System.out.println("3. Unique Elements Check");
            System.out.println("4. Matrix Multiplication");
            System.out.println("5. Gaussian Elimination");
            System.out.println("6. Binary Representation Length");
            System.out.println("7. Factorial");
            System.out.println("8. Recursive Binary Count (BinRcc)");
            System.out.println("9. Exit");
            System.out.print("Your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    int[] A = inputArray(input);
                    System.out.print("Enter the key to search for: ");
                    int key = input.nextInt();
                    int index = algorithms.SequentialSearch(A, key);
                    System.out.println("Result index: " + index);
                }
                case 2 -> {
                    int[] A = inputArray(input);
                    int max = algorithms.MaxElement(A);
                    System.out.println("Maximum element: " + max);
                }
                case 3 -> {
                    int[] A = inputArray(input);
                    boolean isUnique = algorithms.UniqueElements(A);
                    System.out.println("All elements unique? " + isUnique);
                }
                case 4 -> {
                    System.out.print("Enter matrix size (n x n): ");
                    int n = input.nextInt();
                    System.out.println("Enter Matrix A:");
                    int[][] A = inputMatrix(input, n);
                    System.out.println("Enter Matrix B:");
                    int[][] B = inputMatrix(input, n);
                    int[][] C = algorithms.MatrixMultiplication(A, B);
                    System.out.println("Result of Matrix Multiplication:");
                    printMatrix(C);
                }
                case 5 -> {
                    System.out.print("Enter matrix size (n x n): ");
                    int n = input.nextInt();
                    System.out.println("Enter Matrix A:");
                    int[][] A = inputMatrix(input, n);
                    int[][] result = algorithms.GaussianElimination(A);
                    System.out.println("Matrix after Gaussian Elimination:");
                    printMatrix(result);
                }
                case 6 -> {
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    int bits = algorithms.Binary(n);
                    System.out.println("Binary length: " + bits);
                }
                case 7 -> {
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    int fact = algorithms.Factorial(n);
                    System.out.println("Factorial: " + fact);
                }
                case 8 -> {
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    int binCount = algorithms.BinRcc(n);
                    System.out.println("Recursive binary count: " + binCount);
                }
                case 9 -> {
                    System.out.println("Exiting. Goodbye!");
                    input.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int[] inputArray(Scanner input) {
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        return A;
    }

    private static int[][] inputMatrix(Scanner input, int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter row " + (i + 1) + " (space-separated):");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
