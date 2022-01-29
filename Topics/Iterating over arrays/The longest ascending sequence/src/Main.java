import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] arr = new int[scanner.nextInt()];
        // int ret = 0;
        // int eq = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = scanner.nextInt();
        //     if (i == 0) {
        //         ret = 1;
        //         eq = 1;
        //     } else if (arr[i] > arr[i - 1]) {
        //         eq++;
        //     } else {
        //         ret = eq > ret ? eq : ret;
        //         eq = 1;
        //     }
        // }
        // System.out.println(eq > ret ? eq : ret);
        int size = scanner.nextInt();
        int lastNum = scanner.nextInt();
        int curNum = 0;
        int maxLen = 1;
        int cmp = 1;
        for (int i = 1; i < size; i++) {
            curNum = scanner.nextInt();
            if (curNum > lastNum) {
                cmp++;
            } else {
                maxLen = cmp > maxLen ? cmp : maxLen;
                cmp = 1;
            }
            lastNum = curNum;
        }
        System.out.println(cmp > maxLen ? cmp : maxLen);
    }
}