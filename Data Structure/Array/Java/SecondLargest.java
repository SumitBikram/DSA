public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4, 10, 11, 15, 8, 1, 3};
        System.out.println("Second largest element is:\t" + arr[secondLargestIndex(arr)]);
    }

    static int secondLargestIndex(int[] arr) {
        int secondLargest = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
}
