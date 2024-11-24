import java.util.Arrays;

public class ConsequtiveOne {
    public static void main(String[] args) {
        int[] arr = new CreateArray(10, 2).getArray();
        System.out.println("Initial array:\t" + Arrays.toString(arr));
        System.out.println("Consequtive one:\t" + countConsequtiveOnes(arr));
    }

    static int countConsequtiveOnes(int[] arr) {
        int res = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
