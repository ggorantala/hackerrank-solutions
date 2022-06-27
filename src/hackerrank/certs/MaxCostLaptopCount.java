package hackerrank.certs;

import java.util.Scanner;

public class MaxCostLaptopCount {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = 0, n = in.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (i = 0; i < n; i++) a[i] = in.nextInt();
    n = in.nextInt();
    for (i = 0; i < n; i++) b[i] = (in.next().equals("legal")) ? 1 : 0;

    int dc = in.nextInt(), s = 0, sum = 0, max = 0;
    for (i = 0; i < n; i++) {
      s += b[i];
      sum += a[i];
      if (s == dc) {
        max = (sum > max) ? sum : max;
        s = sum = 0;
      }
    }
    System.out.println(max);
    in.close();
  }
}
