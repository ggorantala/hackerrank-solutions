package hackerrank.ps.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();
        int T = 3;
        int S = 3;

        while (T-- > 0) {
            alice.add(sc.nextInt());
        }
        while (S-- > 0) {
            bob.add(sc.nextInt());
        }

        List<Integer> result = compareTriplets(alice, bob);

        for (int value : result) {
            System.out.print(value + " ");
        }
        sc.close();
    }

    public static List<Integer> compareTriplets(List<Integer> A, List<Integer> B) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > B.get(i)) {
                a++;
            } else if (A.get(i) < B.get(i)) {
                b++;
            }
        }
        return new ArrayList<>(Arrays.asList(a, b));
    }
}
