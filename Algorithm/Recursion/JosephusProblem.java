import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements(n):\t");
        n = sc.nextInt();

        
        System.out.print("Enter the position of element(k) :\t");
        k = sc.nextInt();
        System.out.print("Only survivor:\t" + (joshephus(n, k) + 1));;
        sc.close();
    }

    public static int joshephus(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return ((joshephus(n - 1, k) + k) % n);
    }
}
