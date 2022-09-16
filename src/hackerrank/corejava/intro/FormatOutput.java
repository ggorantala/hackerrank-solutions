package hackerrank.corejava.intro;

import java.util.Scanner;

public class FormatOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        int i = 0;
        while (i < 3) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            i++;
        }
        System.out.println("================================");
    }
}
