import java.util.Scanner;
/**
 * Program to calculate the factorial of a number.
 */
public class Main {
    /**
     * Recursive method to calculate the factorial of a number.
     *
     * @param n The number for which factorial is calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            System.out.println(factorial(n));
    }
}
