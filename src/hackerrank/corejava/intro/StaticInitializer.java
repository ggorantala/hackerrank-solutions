package hackerrank.corejava.intro;

import java.util.Scanner;

public class StaticInitializer {
    static boolean flag = true;
    static int B, H;
    static Scanner sc = new Scanner(System.in);

    static {
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
    }
}
