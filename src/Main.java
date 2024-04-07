import java.util.Scanner;
/**
 * Program to find the n-th element in the Fibonacci sequence,
 * where each element is the sum of the two preceding elements (Fn = Fn-1 + Fn-2),
 * with initial values F0 = 0 and F1 = 1.
 */
public class Main {
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
    /**
     * Method to calculate the nth Fibonacci number.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
