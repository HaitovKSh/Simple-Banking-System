import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int ret = 0;
        int equal = scanner.nextInt();
        for (int i: arr) {
            ret += i > equal ? i : 0;
        }
        System.out.println(ret);
    }
}