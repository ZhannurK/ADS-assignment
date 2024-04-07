import java.util.Scanner;
/**
 * Program to check if a string contains only digits.
 */
public class Main {
    /**
     * Recursive method to check if a string contains only digits.
     *
     * @param n The index of the character to check.
     * @param s The string to check.
     * @return True if all characters in the string are digits, false otherwise.
     */
    private static boolean isAllDigits(int n, String s){
        if (s.isEmpty()){
            return true;
        }
        if(!Character.isDigit(s.charAt(n))){
            return false;
        }
        return isAllDigits(n+1,s);
    }
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (isAllDigits(0, n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}