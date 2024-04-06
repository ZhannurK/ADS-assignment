import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(FindMin(n, arr));
    }

    public static double FindMin(int n, int[] arr){
        int minel = arr[0];
        for (int i = 0; i < n; i++){
            if (arr[i] < minel){
                minel = arr[i];
            }
        }
        return minel;
    }

}