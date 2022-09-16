package hackerrank.ps.warmup;

import java.util.Scanner;

public class BirthdayCandles {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        int[] nums = new int[T];
        int i = 0;

        while (T-- > 0) {
            nums[i++] = sc.nextInt();
        }

        int max = nums[0];
        int maxOccurrence = 0;

        for (int num : nums) {
            if (num > max) {
                max = num;
                maxOccurrence = 1;
            } else if (num == max) {
                maxOccurrence++;
            }
        }
        System.out.println(maxOccurrence);

        sc.close();
    }
}
