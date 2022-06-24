package problemsolving;

import java.util.Scanner;

public class ArraySum {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    int[] array = new int[T];
    int i = 0;
    while (T-- > 0) {
      int val = sc.nextInt();
      array[i++] = val;
    }

    int sum = 0;
    for (int el : array) {
      sum += el;
    }
    System.out.println(sum);
    sc.close();
  }
}
