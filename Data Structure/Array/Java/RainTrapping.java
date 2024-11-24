import java.util.Arrays;

public class RainTrapping {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new CreateArray(n, 10).getArray();
        System.out.println("Initial size:\t" + Arrays.toString(arr));
        System.out.println("Trapped size:\t" + getTrappedWaterLevel(arr));
    }

    static int getTrappedWaterLevel(int[] arr) {
        int res = 0;
        int[] lMaxArr = new int[arr.length];
        int[] rMaxArr = new int[arr.length];

        lMaxArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            //calculate the left side water level
            lMaxArr[i] = Math.max(arr[i], lMaxArr[i - 1]);
        }

        rMaxArr[arr.length - 1] = arr[arr.length - 1];
        for(int i = (arr.length - 2); i >= 0; i--) {
            //calculate the right side max water level
            rMaxArr[i] = Math.max(arr[i], rMaxArr[i + 1]);
        }

        for(int i = 1; i < arr.length - 1; i++) {
            res += (Math.min(lMaxArr[i], rMaxArr[i]) - arr[i]);
        }
        return res;
    }
}
