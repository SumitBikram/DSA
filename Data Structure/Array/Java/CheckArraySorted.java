public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // int[] arr = {10, 10, 5};
        System.out.println(checkArraySorted(arr) ? "Array is sorted!" : "Array is not sorted!");
    }

    static boolean checkArraySorted(int[] arr) {
        int element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (element <= arr[i]) {
                element = arr[i];
            } else {
                return false;
            }
        }
        return true;
    }
}
