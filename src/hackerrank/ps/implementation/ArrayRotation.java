package hackerrank.ps.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRotation {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int l = 0;
    int[] nums = new int[n];
    while (n-- > 0) {
      nums[l++] = sc.nextInt();
    }

    List<Integer> queries = new ArrayList<>();

    while (q-- > 0) {
      queries.add(sc.nextInt());
    }

    k = k % nums.length;
    rotate(nums, 0, nums.length - 1);
    rotate(nums, k, nums.length - 1);
    rotate(nums, 0, k - 1);

    for (int list : queries) {
      System.out.println(nums[list]);
    }

    sc.close();
  }

  public static void rotate(int[] nums, int i, int j) {
    while (i < j) {
      int temp = nums[i];
      nums[i++] = nums[j];
      nums[j--] = temp;
    }
  }
}
