package hackerrank.ps.implementation;

import java.util.Scanner;

public class RepeatingString {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String A = sc.next();
        long n = sc.nextLong();
        long count = 0;
        for (char ch : A.toCharArray()) {
            if (ch == 'a') {
                count++;
            }
        }

        long quotient = n / A.length();
        long rem = n % A.length();

        count = quotient * count;

        for (int i = 0; i < rem; i++) {
            if (A.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
