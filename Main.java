import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 1. 
        int n = sc.nextInt();
        new printNumberBinOctHex(n);
        */

        /* 2.
        int n = sc.nextInt();
        new normalizeAngle(n);
        */

        /* 3.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        new sum3(
                a,
                b,
                c
        );
        */

        /* 4.
       new largestAndSmallestDouble();
        */

        /* 5.
        new doubleToInt();
         */
        BigInteger n = BigInteger.valueOf(sc.nextInt());
        System.out.println(Factorial.fact(n));
    }
}
