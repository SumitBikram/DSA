import java.util.Arrays;
import java.util.Random;

public class LeadersElement {
     public static void main(String[] args) {
        int n = 8;
        Random rn = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rn.nextInt(100);
        }
        System.out.println("Initial Array:\t" + Arrays.toString(arr));
        printLeadersElement(arr);
    }

    static void printLeadersElement(int[] arr) {
        int currentHighest = arr[arr.length - 1];
        System.out.print(currentHighest + " ");
        for(int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > currentHighest) {
                currentHighest = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
