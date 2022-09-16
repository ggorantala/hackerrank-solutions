package hackerrank.corejava.strings;

import java.util.Scanner;

public class SubstrOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        sc.close();

        System.out.println(A.substring(start, end));
    }
}
