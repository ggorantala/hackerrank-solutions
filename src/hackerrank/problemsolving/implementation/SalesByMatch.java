package hackerrank.problemsolving.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesByMatch {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();

    int[] nums = new int[T];
    int i = 0;
    while (T-- > 0) {
      nums[i++] = sc.nextInt();
    }

    Map<Integer, Integer> memo = new HashMap<>();

    for (int val : nums) {
      memo.put(val, memo.getOrDefault(val, 0) + 1);
    }

    int count = 0;

    for (int val : memo.values()) {
      int k = val / 2;
      count += k;
    }

    System.out.println(count);
    sc.close();
  }
}
