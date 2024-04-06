import java.util.Scanner;

public class Main {
    static int binomialCoefficient(int n, int m){
        if (m > n){
            return 0;
        }
        if (m == 0 || n == 0){
            return 1;
        }
        return binomialCoefficient(n - 1, m - 1) + binomialCoefficient(n - 1, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(binomialCoefficient(n, m));
    }
}