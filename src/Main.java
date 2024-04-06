import java.util.Scanner;

public class Main {
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        }
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {
            return false;
        }
        return isAllDigits(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isAllDigits(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
