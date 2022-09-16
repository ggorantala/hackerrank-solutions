package hackerrank.corejava.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        int start = 0;
        int end = A.length() - 1;

        while (start <= end) {
            if (A.charAt(start++) != A.charAt(end--)) {
                break;
            }
        }
        if (start < end) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
