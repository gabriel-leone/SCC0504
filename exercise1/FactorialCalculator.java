// Nome: Gabriel Pietro Leone, Nº USP: 13874729
// Nome: Bruno Giacomini Volpe, Nº USP: 14651980

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Creates a new object of Scanner class
        System.out.println("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt(); // Reads an integer from the user
        if (n <= 0) {
            // Throws an exception if the input is not a positive integer
            throw new Exception("The input must be a positive integer");
        }

        // Calls the methods to calculate factorial and sum of n numbers
        System.out.println("Factorial of " + n + " (Recursive): " + factorialRecursive(n));
        System.out.println("Factorial of " + n + " (Iterative): " + factorialIterative(n));
        System.out.println("Sum of the " + n + " first numbers from 0 using iterative method: " + sumIterative(n));
    }
    // Recursive method to calculate factorial
    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Iterative method to calculate factorial
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Iterative method to calculate sum of n numbers
    public static int sumIterative(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
