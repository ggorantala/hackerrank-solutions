package hackerrank.corejava.dataStructures;

import java.util.Scanner;

public class OneDimentionalArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(sc.nextLine());
    }
    for (int el : array) {
      System.out.println(el);
    }
  }
}
