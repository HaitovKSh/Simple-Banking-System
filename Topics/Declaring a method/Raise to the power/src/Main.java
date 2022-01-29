import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        long ret = 1;
        if (m > 0) {
            for (int i = 0; i < m; i++) {
                ret *= n;
            }
        }
        return ret;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}