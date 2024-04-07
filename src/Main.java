import java.util.Scanner;
/**
 * Program to determine if a given number "n" is prime.
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
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
    /**
     * Method to check if a number is prime.
     *
     * @param n The number to check.
     * @return True if the number is prime, false otherwise.
     * Here time complexity is O(sqrt(n)) because it iterates up to the square root of n to check for divisibility.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}