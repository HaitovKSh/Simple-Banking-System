import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long a = scanner.nextLong();
        String op = scanner.next();
        long b = scanner.nextLong();

        switch (op.charAt(0)) {
            case '+': sum(a, b);
                break;
            case '-': diff(a, b);
                break;
            case '/': div(a, b);
                break;
            case '*': mult(a, b);
                break;
            default: System.out.println("Unknown operator");
                break;
        }
    }

    static void sum(long a, long b) {
        System.out.println(a + b);
    }

    static void diff(long a, long b) {
        System.out.println(a - b);
    }

    static void div(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }

    static void mult(long a, long b) {
        System.out.println(a * b);
    }
}