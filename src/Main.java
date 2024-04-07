import java.util.Scanner;
/**
 * Program that takes two numbers, "a" and "n", and returns the result of raising "a" to the power of "n" (an).
 */
public class Main {
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, n));
    }
    /**
     * Method to calculate the power of a number.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of raising 'a' to the power of 'n'.
     * In this method time complexity is O(n) because it makes n recursive calls.
     */
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}