package hackerrank.certs;

import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    String[] array = A.split(" ");

    int sum = 0;
    StringBuilder res = new StringBuilder();
    for (String s : array) {
      if (isNumeric(s)) {
        sum += Integer.parseInt(s);
      } else {
        res.append(s);
      }
    }
    System.out.println(sum > 0 ? sum : res);
  }

  private static boolean isNumeric(String str) {
    return str != null && str.matches("[0-9.]+");
  }
}
