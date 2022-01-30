import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int lastNum = 0;
        boolean sorted = true;
        int cmp = 0;
        for (int i = scanner.nextInt(); i != 0; i = scanner.nextInt()) {
            switch (cmp) {
                case 1: if (lastNum > i) {
                        sorted = false;
                    }
                    break;
                case -1: if (lastNum < i) {
                        sorted = false;
                    }
                    break;
                default:
                    if (lastNum != 0 && lastNum != i) {
                        cmp = lastNum > i ? -1 : 1;
                    }
                    break;
            }
            lastNum = i;
        }
        System.out.println(sorted);
    }
}