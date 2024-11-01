/**
 * Let's understand what is merge sort algorithm.
 * The Merge Sort algorithm is a divide-and-conquer algorithm that sorts an
 * array by first dividing it into smaller sub-arrays, and then merging the
 * sub-arrays back together as per the sorting order i.e. descending or
 * ascending.It does all this recursively i.e. by using recursive functions. Its
 * steps are:- 1 - Divide the unsorted array into two sub-arrays, half the size
 * of the original array. 2- Continue to divide the sub-arrays as long as the
 * current length of the sub-array is greater than one. 3- Merge two sub-arrays
 * together by always putting the lowest value first(if needed in ascending
 * order) or the highest value first(if needed in descending order). 4- Keep
 * merging until there are no sub-arrays left. The time complexity of this
 * sorting algorithm is O(n*logn)
 */

// Scanner is a class that enables us to take input in java.
import java.util.Scanner;
public class MergeSort {
  // This is the function that implements merge sort algorithm.
  public void mergeSort(int array[], int left, int right) {
    int mid = (left + right) / 2;

    /*Here i have used the following condition because if left= right then it
    means that the array is having only one element and we cannot divide an
    array having only one element into two parts having positive length.
    The merge() function is also in this condition because if there is only one
    element then there is no need to merge it.... it's already merged. This
    condition also works as the base case to end the recursive function.*/
    if (left != right) {
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      merge(array, mid, right, left);
    }
  }

  // This is the function that merges the two arrays after sorting them.
  void merge(int arr[], int mid, int right, int left) {
    int k = left;
    int l1[] = new int[mid - left + 1];
    int l2[] = new int[right - mid];
    int ll = 0, rr = 0;
    for (int i = 0; i < l1.length; i++) {
      l1[i] = arr[k++];
    }
    for (int i = 0; i < l2.length; i++) {
      l2[i] = arr[k++];
    }
    k = left;
    while (ll < l1.length && rr < l2.length) {
      if (l1[ll] <= l2[rr]) {
        arr[k++] = l1[ll++];
      } else {
        arr[k++] = l2[rr++];
      }
    }
    while (ll < l1.length) {
      arr[k++] = l1[ll++];
    }
    while (rr < l2.length) {
      arr[k++] = l2[rr++];
    }
  }

  // This is the main() function.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt(); // Taking the input of the number of elements in the
                          // array.
    int array[] =
        new int[n]; // Initialised an array having n number of elements.

    // Taking the input of elements into the array.
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    // Printing the initial order of elements in the array.
    System.out.println("The array initially is - \n");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println("\nThe array after sorting is \n");
    MergeSort m = new MergeSort(); // Created an object of the mergesort class.
    m.mergeSort(array, 0, n - 1); // Called the merge_sort function to sort the
                                  // array using merge sort algorithm.

    // Printing the array after applying the merge sort algorithm.
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    sc.close(); // Closing the scanner object.
  }
}
