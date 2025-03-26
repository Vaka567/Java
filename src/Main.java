import java.util.*;
public class Main {
//printing rectangles
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

    public static void main(String[] args) {
        bruteForcePrint();
    }
}

