package hackerrank.ps.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        int l = 0;

        while (n-- > 0) {
            nums[l++] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j && (nums[i] + nums[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
