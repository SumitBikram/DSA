package Mathematics;

import java.util.Scanner;

public class ModularInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entern a number:\t");
        int a = sc.nextInt();
        System.out.print("Enter another number under which you want to find the inverse modulo:\t");
        int m = sc.nextInt();
        int ans = modInverse(a, m);
        System.out.print("Modulo Inverse of " + a + " under " + m + " is :\t" + ans);
        sc.close();
    }

    public static int modInverse(int a, int m) {
        int ans = -1;
        if (isCoPrime(a, m)) {
            for (int i = 0; i < m; i++) {
                if ((((a % m) * (i % m)) % m) == 1) {
                    ans = (i % m);
                    break;
                }
            }
        } else {
            ans = -1;
        }
        return ans;
    }

    public static boolean isCoPrime(int a, int b) {
        return (findGCD(a, b) == 1);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
