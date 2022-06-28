package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class PrimeRunTimeComplexity {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();

    int[] array = new int[T];
    int i = 0;

    while (T-- > 0) {
      array[i++] = sc.nextInt();
    }

    for (int num : array) {
      System.out.println(isPrime(num));
    }

    sc.close();
  }

  public static String isPrime(int n) {
    if (n < 2) return "Not prime";

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return "Not prime";
      }
    }
    return "Prime";
  }
}
