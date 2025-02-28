import java.sql.SQLOutput;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 1;
        for(int i = 0;i<10;i++ ){
            System.out.println(n*i);
        }
        switch(n) {
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3 :
                System.out.println(a*b);
                break;
            case 4 :
                System.out.println(a/b);
                break;
            case 5 :
                System.out.println(a%b);
                break;
            default :
                System.out.println("not valid");


        }

    }
}