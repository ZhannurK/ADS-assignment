import java.util.Scanner;
/**
 * Program that takes a number "n" and an array containing "n" elements,
 * and returns the smallest element from the array.
 */
public class Main{
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(FindMin(n, arr));
    }
    /**
     * Method to find the minimum element in an array.
     *
     * @param n   The size of the array.
     * @param arr The array in which to find the minimum element.
     * @return The minimum element in the array.
     */
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