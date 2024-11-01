import java.util.Scanner;

public class SubsetGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        System.out.println("All the power set of \"" + userInput + "\" are:");
        subsetGenerate(userInput, "", 0);
        sc.close();
    }

    static void subsetGenerate(String inp, String currString, int i) {
        if (i == inp.length()) {
            if (currString.isEmpty()) {
                System.out.print("\"\"" + " ");
            } else {
                System.out.print(currString + " ");
            }
            return;
        }
        subsetGenerate(inp, currString, i + 1);  // Include the current character
        subsetGenerate(inp, currString + inp.charAt(i), i + 1);  // Exclude the current character
    }
}