import java.util.Scanner;

public class PrintingRectangles {

    public static void bruteForcePrint(int length, int breadth) {
        // Print top border
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Print sides
        for (int i = 0; i < breadth; i++) {
            System.out.print("|");
            for (int j = 0; j < length - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // Print bottom border
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        bruteForcePrint(length, breadth);

        scanner.close();
    }
}