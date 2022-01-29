import java.util.*;

public class Main {
    public static final int MESURESIDES = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = getBox(scanner);
        int[] box2 = getBox(scanner);
        switch (boxInclusive(box1, box2)) {
            case 1: System.out.println("Box 1 > Box 2");
                break;
            case -1: System.out.println("Box 1 < Box 2");
                break;
            default: System.out.println("Incompatible");
                break;
        }

    }

    public static int[] getBox(Scanner scanner) {
        int[] box = new int[MESURESIDES];
        for (int i = 0; i < box.length; i++) {
            box[i] = scanner.nextInt();
        }
        return box;
    }

    public static int boxInclusive(int[] box1, int[] box2) {
        Arrays.sort(box1);
        Arrays.sort(box2);
        int ret = Arrays.compare(box1, box2);

        for (int i = 0; i < box1.length; i++) {
            if (box1[i] == box2[i]) {
                return 0;
            }
        }
        return ret;
    }
}