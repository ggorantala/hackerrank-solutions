package hackerrank.corejava.dataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetPairs {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        Set<String> memo = new HashSet<>();
        while (T-- > 0) {
            String A = sc.next();
            String B = sc.next();
            memo.add(A + "-" + B);
            System.out.println(memo.size());
        }
        sc.close();
    }
}
