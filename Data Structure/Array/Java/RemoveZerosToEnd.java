import java.util.Arrays;

class RemoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 10, 0, 3, 0, 4, 5, 0, 6, 0, 0 };
        System.out.println("Array: " + Arrays.toString(arr));
        removeZerosToEnd(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }

    static void removeZerosToEnd(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if(i != count) {
                    swap(arr, i, count);
                }
                count++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}