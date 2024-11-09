import java.util.Scanner;

public class TowerOfHanoi {

    static void hanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n > 0) {
            hanoi(n - 1, from_rod, aux_rod, to_rod);
            System.out.println("Move disk " + n + " from rod " + from_rod + " --> rod " + to_rod);
            hanoi(n - 1, aux_rod, to_rod, from_rod);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of discs:\t");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Solution for Tower of Hanoi with " + n + " disks:");
            hanoi(n, 'A', 'C', 'B');

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}