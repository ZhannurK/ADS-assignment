import java.util.Scanner;

public class Main {
    public static int countAccurance(int n, int m, String s) {
        int count = 0;
        if (m == s.length()){
            return 0;
        }
        if (s.charAt(m) == n){
            count++;
        }
            count += countAccurance(n, m + 1, s);
            return count;
    }
    public static void main(String[] args) {
        String string = "abbabaab";
        char a = 'a';
        System.out.println(countAccurance(a, 0, string));
    }
}
