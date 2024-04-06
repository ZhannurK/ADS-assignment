import java.util.Scanner;

public class Main {
    private static boolean isAllDigits(int n, String s){
        if (s.isEmpty()){
            return true;
        }
        if(!Character.isDigit(s.charAt(n))){
            return false;
        }
        return isAllDigits(n+1,s);
    }

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