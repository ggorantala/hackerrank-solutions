package hackerrank.corejava.strings;

import java.util.Scanner;

public class StringTokens {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (!sc.hasNext()) {
      System.out.println("0");
      return;
    }
    String A = sc.nextLine();
    sc.close();

    // Write your code here.
    String[] tokens = A.trim().split("[!,?.*_'@\\ ]+");
    int size = tokens.length;
    System.out.println(size);
    for (String token : tokens) {
      System.out.println(token);
    }
  }
}
