package Mathematics;

import java.util.Scanner;

// Given an integer N. Find the number of digits that appear in its factorial. 
// Factorial is defined as, factorial(n) = 1*2*3*4……..*N & factorial(0) = 1.
public class FactorialDigitCounter {
    public static int countFactorialDigits(int n) {
        if (n <= 1) {
            return 1; // 0! and 1! both have 1 digit
        }

        double digitCount = 0;
        for (int i = 2; i <= n; i++) {
            digitCount += Math.log10(i);
        }

        return (int) Math.floor(digitCount) + 1;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.print("Enter a number:\t");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            System.out.println("Number of digits in " + n + "! is: " + countFactorialDigits(n));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
