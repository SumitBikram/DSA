import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 100, 11, 15, 8, 1, 3};
        System.out.print("Array:\t");
        System.out.println(Arrays.toString(arr));
        System.out.println("Larget element in the array:\t" + findLargest(arr));
    }

    static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
