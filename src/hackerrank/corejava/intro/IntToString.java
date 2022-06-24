package hackerrank.corejava.intro;

import java.util.Scanner;

public class IntToString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();

    sc.close();
    String B = String.valueOf(A);

    System.out.println(B);
    System.out.println(B instanceof String); // String typeof check
  }
}
