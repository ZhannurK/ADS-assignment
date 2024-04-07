import java.util.Scanner;
/**
 * Program to calculate the binomial coefficient C(n, k) using the formula C(n, k) = C(n-1, k-1) + C(n-1, k),
 * where C(n, 0) = C(n, n) = 1
 */
public class Main {
    /**
     * Method to calculate the binomial coefficient (n choose m).
     *
     * @param n The total number of items.
     * @param m The number of items to choose.
     * @return The binomial coefficient.
     */
    public static int binomialCoefficient(int n, int m){
        if (m > n){
            return 0;
        }
        if (m == 0 || n == 0){
            return 1;
        }
        return binomialCoefficient(n - 1, m - 1) + binomialCoefficient(n - 1, m);
    }
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(binomialCoefficient(n, m));
    }
}