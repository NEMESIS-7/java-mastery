package reynolds32896;

import java.util.InputMismatchException;
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

            int choice = getPositiveIntInput(input, "Your choice: ");

            switch (choice) {
                case 1 -> {
                    int[] A = inputArray(input);
                    int key = getIntInput(input, "Enter the key to search for: ");
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
                    int n = getPositiveIntInput(input, "Enter matrix size (n x n): ");
                    System.out.println("Enter Matrix A:");
                    int[][] A = inputMatrix(input, n);
                    System.out.println("Enter Matrix B:");
                    int[][] B = inputMatrix(input, n);
                    int[][] C = algorithms.MatrixMultiplication(A, B);
                    System.out.println("Result of Matrix Multiplication:");
                    printMatrix(C);
                }
                case 5 -> {
                    int n = getPositiveIntInput(input, "Enter matrix size (n x n): ");
                    System.out.println("Enter Matrix A:");
                    int[][] A = inputMatrix(input, n);
                    int[][] result = algorithms.GaussianElimination(A);
                    System.out.println("Matrix after Gaussian Elimination:");
                    printMatrix(result);
                }
                case 6 -> {
                    int n = getPositiveIntInput(input, "Enter a number: ");
                    int bits = algorithms.Binary(n);
                    System.out.println("Binary length: " + bits);
                }
                case 7 -> {
                    int n = getPositiveIntInput(input, "Enter a number: ");
                    int fact = algorithms.Factorial(n);
                    System.out.println("Factorial: " + fact);
                }
                case 8 -> {
                    int n = getPositiveIntInput(input, "Enter a number: ");
                    int binCount = algorithms.BinRcc(n);
                    System.out.println("Recursive binary count: " + binCount);
                }
                case 9 -> {
                    System.out.println("Exiting. Goodbye!");
                    break;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }

            if (choice == 9) break;
        }

        input.close();
    }

    private static int[] inputArray(Scanner input) {
        int n = getPositiveIntInput(input, "Enter number of elements: ");
        int[] A = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            A[i] = getIntInput(input, "Element " + (i + 1) + ": ");
        }
        return A;
    }

    private static int[][] inputMatrix(Scanner input, int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = getIntInput(input, "Value at (" + (i + 1) + "," + (j + 1) + "): ");
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }

    private static int getIntInput(Scanner input, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = input.nextInt();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // clear invalid input
            }
        }
    }

    private static int getPositiveIntInput(Scanner input, String prompt) {
        int value;
        while (true) {
            value = getIntInput(input, prompt);
            if (value >= 0) return value;
            else System.out.println("Please enter a non-negative number.");
        }
    }
}
