package hackerrank.ps.implementation;

import java.util.Scanner;

public class JumpClouds {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();

    int[] nums = new int[T];
    int l = 0;

    while (T-- > 0) {
      nums[l++] = sc.nextInt();
    }

    int count = -1;

    for (int i = 0; i < nums.length; i++, count++) {
      if (i < nums.length - 2 && nums[i + 2] == 0) {
        i++;
      }
    }

    System.out.println(count);

    sc.close();
  }
}
