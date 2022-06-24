package hackerrank.corejava.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n + 2];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    sc.close();

    for (int i = 1; i < n; i++) {
      for (int j = i; j >= 1; j--) {
        BigDecimal first = new BigDecimal(s[j]);
        BigDecimal second = new BigDecimal(s[j - 1]);

        if (first.compareTo(second) > 0) {
          String temp = s[j];
          s[j] = s[j - 1];
          s[j - 1] = temp;

        } else {
          break;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}
