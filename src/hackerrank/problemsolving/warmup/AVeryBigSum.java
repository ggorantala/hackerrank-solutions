package hackerrank.problemsolving.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    List<Long> values = new ArrayList<>();
    while (T-- > 0) {
      values.add(sc.nextLong());
    }

    long result = 0;

    for (long l : values) {
      result += l;
    }

    System.out.println(result);
    sc.close();
  }
}
