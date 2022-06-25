package hackerrank.problemsolving.implementation;

import java.util.Scanner;

public class AppleAndOranges {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int s = sc.nextInt();
    int t = sc.nextInt();

    int a = sc.nextInt();
    int b = sc.nextInt();

    int m = sc.nextInt();
    int n = sc.nextInt();

    int[] mArray = new int[m];
    int[] nArray = new int[n];

    int i = 0, j = 0;
    while (m-- > 0) {
      mArray[i++] = sc.nextInt();
    }

    while (n-- > 0) {
      nArray[j++] = sc.nextInt();
    }

    for (int k = 0; k < mArray.length; k++) {
      mArray[k] = mArray[k] + a;
    }

    for (int k = 0; k < nArray.length; k++) {
      nArray[k] = nArray[k] + b;
    }

    int first = 0;
    int second = 0;

    for (int k : mArray) {
      if (k >= s && k <= t) {
        first++;
      }
    }

    for (int k : nArray) {
      if (k >= s && k <= t) {
        second++;
      }
    }

    System.out.println(first);
    System.out.println(second);
    sc.close();
  }
}
