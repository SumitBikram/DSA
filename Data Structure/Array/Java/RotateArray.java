import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int n = 8, d;
        System.out.print("Enter the number of positions to rotate:\t");
        //take an integer input from the console.
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        Random rn = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rn.nextInt(10);
        }
        System.out.println("Initial Array:\t" + Arrays.toString(arr));
        rotateArrayOptimized(arr, d);
        System.out.println("Result Array:\t" + Arrays.toString(arr));
        sc.close();
    }

    /**
     * @param arr
     * @param positionToRotate
     * 
     * Time Complexity: O(n*d)
     * Auxiliary Space: theta(1)
     */
    static void rotateArrayNaive(int[] arr, int positionToRotate) {
        int shift = positionToRotate;
        while (shift > 0) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            shift--;
        }
    }

    static void rotateArrayOptimized(int[] arr, int positionToRotate) {
        rotate(arr, 0, (positionToRotate - 1));
        rotate(arr, positionToRotate, arr.length - 1);
        rotate(arr, 0, arr.length - 1);
    }

    static void rotate(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
