package hackerrank.corejava.strings;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        sc.close();

        A = A.toLowerCase();
        B = B.toLowerCase();

        int[] memo = new int[2 << 7];

        for (char ch : A.toCharArray()) {
            memo[ch]++;
        }

        for (char ch : B.toCharArray()) {
            if (memo[ch] > 0) {
                memo[ch]--;
            } else {
                // Not Anagrams
                System.out.println("Not Anagrams");
                System.exit(0); // normal exit
            }
        }

        for (int i : memo) {
            if (i > 0) {
                // Not Anagrams
                System.out.println("Not Anagrams");
                System.exit(0);
            }
        }
        System.out.println("Anagrams");
    }
}
