import java.util.Scanner;
/**
 * Program that takes a number "n" and an array containing "n" elements,
 * and calculates the average of the elements in the array.
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
        System.out.println(average(n, arr));
    }
    /**
     * Method to calculate the average of elements in an array.
     *
     * @param n   The size of the array.
     * @param arr The array containing the elements.
     * @return The average of elements in the array.
     */
    public static double average(int n, int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}