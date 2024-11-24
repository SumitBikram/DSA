import java.util.Arrays;

public class MaxDiff {
    public static void main(String[] args) {
        int n = 10;
       
        int[] arr = new CreateArray().getArr(n);
        System.out.println("Initial Array:\t" + Arrays.toString(arr));
        System.out.println("Maximum Differece:\t" + maxDiff(arr));
    }

    static int maxDiff(int[] arr) {
        int res = arr[1] - arr[0], minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, (arr[i] - minVal));
            minVal = Math.min(minVal, arr[i]);
        }
        return res;
    }
}
