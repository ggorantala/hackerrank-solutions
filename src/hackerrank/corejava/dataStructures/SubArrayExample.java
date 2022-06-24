package hackerrank.corejava.dataStructures;

import java.util.Scanner;

public class SubArrayExample {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    sc.close();

    int result = 0;

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += nums[j];
        if (sum < 0) {
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
