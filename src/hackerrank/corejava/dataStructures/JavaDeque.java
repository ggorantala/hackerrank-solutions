package hackerrank.corejava.dataStructures;

import java.util.*;

public class JavaDeque {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int M = sc.nextInt();

    int k = 0;
    int[] nums = new int[N];

    while (N-- > 0) {
      nums[k++] = sc.nextInt();
    }

    Set<Integer> uniqueValues = new HashSet<>();

    for(int i = 0; i < nums.length - M + 1; i++) {
    }
    sc.close();
  }
}
