import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] arr = getArr(scanner);
        int[] arrContains = {scanner.nextInt(),scanner.nextInt()};
        System.out.println(ValInArraySydeBySyde(arr, arrContains);
    }

    public static int[] getArr(Scanner scanner) {
        int[] retArray = new int[scanner.nextInt()];
        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = scanner.nextInt();
        }
        return retArray;
    }

    public static boolean ValInArraySydeBySyde(int[] arr, int[] value) {
        return false;
    }
}