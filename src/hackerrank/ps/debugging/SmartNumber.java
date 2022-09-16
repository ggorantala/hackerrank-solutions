package hackerrank.ps.debugging;

import java.util.Scanner;

public class SmartNumber {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        int[] nums = new int[T];
        int i = 0;

        while (T-- > 0) {
            nums[i++] = sc.nextInt();
        }

        for (int val : nums) {
            int count = 0;
            for (int a = 1; a * a < nums.length; a++) {
                if (val % a != 0) {
                    count++;
                }
            }
            System.out.println(count % 2 != 0 ? "YES" : "NO");
        }
        sc.close();
    }
}
