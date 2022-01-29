import java.util.Scanner;

class Main {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String formRoom = scanner.nextLine();
        switch (formRoom) {
            case "triangle": areaTriangle(scanner);
                break;
            case "rectangle": areaRect(scanner);
                break;
            case "circle": areaCircle(scanner);
                break;
            default:
                break;
        }
    }

    public static void areaRect(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double area = a * b;
        System.out.println(area);
    }

    public static void areaTriangle(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double halfP = (double) (a + b + c) / 2;
        double area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        System.out.println(area);
    }

    public static void areaCircle(Scanner scanner) {
        int r = scanner.nextInt();
        double area = PI * r * r;
        System.out.println(area);
    }
}