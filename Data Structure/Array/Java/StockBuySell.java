import java.util.Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new CreateArray().getArr(n);
        System.out.println("Initail Array:\t" + Arrays.toString(arr));
        System.out.println("Max Profit:\t" + maxProfit(arr, 0, arr.length));
    }

    static int maxProfit(int[] arr, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for(int j = i + 1; j < end; j++) {
                if (arr[i] < arr[j]) {
                    int currProfit = (arr[j] - arr[i]) 
                            + maxProfit(arr, start, i - 1) 
                            + maxProfit(arr, j + 1, end);

                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }
}
