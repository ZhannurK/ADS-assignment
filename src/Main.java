import java.util.Scanner;
/**
 * Program that takes a number "n" and an array of "n" elements,
 * and prints the elements of the array in reverse order without using an array data structure.
 */
public class Main {
    /**
     * Entry point of the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverseArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /**
     * Method to reverse the elements of an array.
     *
     * @param arr   The array to be reversed.
     * @param start The starting index of the subarray.
     * @param end   The ending index of the subarray.
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
}