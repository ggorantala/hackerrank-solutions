package hackerrank.ps.warmup;

import java.util.Scanner;

public class Staircase {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < T; i++) {
      sb.append(" ");
    }
    int j = 0;

    for (int i = 1; i <= T; i++) {
      sb.replace(sb.length() - i, sb.length() - j, "#");
      System.out.println(sb);
      j++;
    }

    sc.close();
  }
}
