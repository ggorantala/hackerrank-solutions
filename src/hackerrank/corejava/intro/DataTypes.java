package hackerrank.corejava.intro;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            try {
                long A = sc.nextLong();
                System.out.println(A + " can be fitted in:");
                if (A >= -128 && A <= 127) System.out.println("* byte");
                if (A >= -32768 && A <= 32767) System.out.println("* short");
                if (A >= -2147483648 && A <= 2147483647) System.out.println("* int");
                if (A >= -9223372036854775808L && A <= 9223372036854775807L) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
