import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr);
        System.out.println("Reverse Array: " + Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = (arr.length - 1);
        while (i < j) {
            swapElement(arr, i, j);
            i++; j--;
        }
    }

    static void swapElement(int[] arr, int i, int j) {
        int a = arr[i];
        int b = arr[j];
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        arr[i] = a;
        arr[j] = b;
    }
}
