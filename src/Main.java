import java.util.Scanner;
/**
 * Program  to find the greatest common divisor (GCD) of two numbers "a" and "b" using the Euclidean Algorithm.
 */
public class Main {
    /**
     * Method to calculate the greatest common divisor (GCD) of two numbers using Euclid's algorithm.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor (GCD) of 'a' and 'b'.
     */
    public static int GCD(int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD(a, b));
    }
}
