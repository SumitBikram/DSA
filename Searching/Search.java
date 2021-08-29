import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements in the array:");
		int n = Integer.parseInt(br.readLine());
				
		int arr[] = new int[n];
		String line = br.readLine();
		String[] strs = line.trim().split("\\s+");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		System.out.println("Enter the element you want to find:");
		int elem = Integer.parseInt(br.readLine());
		
		int index = BinarySearch.binarySearch(arr, 0, n - 1, elem);
		if(index != -1) {
			System.out.println("Element found at:\t" + index);
		}else {
			System.out.println("Element not found!");
		}
	}
}
