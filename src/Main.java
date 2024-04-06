import java.util.Scanner;

public class Main {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0)
            System.out.println("error");
        else
            System.out.println(factorial(n));
    }
}
