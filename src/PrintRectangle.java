public class PrintRectangle {
    public PrintRectangle() {

    }

    public static void bruteForcePrint() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print("|");
            for (int j = 0; j < 18; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }


}
