package hackerrank.corejava.intro;

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
