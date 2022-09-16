package hackerrank.ps.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        int T = 5;

        while (T-- > 0) {
            input.add(sc.nextInt());
        }

        long min = 0, max = 0, sum = 0;
        min = input.get(0);
        max = min;
        sum = min;
        for (int i = 1; i < input.size(); i++) {
            sum += input.get(i);
            if (input.get(i) < min) {
                min = input.get(i);
            }
            if (input.get(i) > max) {
                max = input.get(i);
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
        sc.close();
    }
}
