package hackerrank.corejava.dataStructures;

import java.util.Scanner;

public class OneDimensionArray {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int leap = sc.nextInt();

            int[] game = new int[n];
            int k = 0;
            while (n-- > 0) {
                game[k++] = sc.nextInt();
            }
            System.out.println(isSolvable(leap, game, 0) ? "YES" : "NO");
        }

        sc.close();
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base Cases
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1; // marks as visited

        // Recursive Cases
        return isSolvable(leap, game, i + leap)
                || isSolvable(leap, game, i + 1)
                || isSolvable(leap, game, i - 1);
    }
}
