import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] arr = getArray(scanner);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(neverNextTo(arr, a, b));
    }

    public static int[] getArray(Scanner scanner) {
        int[] retArray = new int[scanner.nextInt()];

        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = scanner.nextInt();
        }
        return retArray;
    }

    public static boolean neverNextTo(int[] array, int a, int b) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == a && array[i - 1] == b
                || array[i - 1] == a && array[i] == b) {
                return false;
            }
        }
        return true;
    }
}