package hackerrank.ps.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagnolDifference {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        int constant = T;
        List<List<Integer>> input = new ArrayList<>();
        while (T-- > 0) {
            int testCases = constant;
            List<Integer> res = new ArrayList<>();
            while (testCases-- > 0) {
                res.add(sc.nextInt());
            }
            input.add(res);
        }

        System.out.println(diagonalDifference(input));
        sc.close();
    }

    public static int diagonalDifference(List<List<Integer>> input) {
        int i = 0;
        int j = input.size() - 1;
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (List<Integer> a : input) {
            firstDiagonal += a.get(i++);
            secondDiagonal += a.get(j--);
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }
}
