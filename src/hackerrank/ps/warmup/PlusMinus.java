package hackerrank.ps.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    while (T-- > 0) {
      list.add(sc.nextInt());
    }

    plusMinus(list);
    sc.close();
  }

  public static void plusMinus(List<Integer> arr) {
    var countOfPositive = (int) arr.stream().filter(i -> i > 0).count();
    var countOfNegative = (int) arr.stream().filter(i -> i < 0).count();
    var countOfZero = (int) arr.stream().filter(i -> i == 0).count();
    var n = arr.size();
    System.out.printf("%6f%n", (double) countOfPositive / n);
    System.out.printf("%6f%n", (double) countOfNegative / n);
    System.out.printf("%6f%n", (double) countOfZero / n);
  }
}
