package hackerrank.corejava.strings;

import java.util.Scanner;

public class StringOperations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    sc.close();

    System.out.println(A.length() + B.length());
    System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

    A = capitaliseFirstChar(A.toCharArray());
    B = capitaliseFirstChar(B.toCharArray());

    System.out.println(A + " " + B);
  }

  public static String capitaliseFirstChar(char[] chars) {
    chars[0] = Character.toUpperCase(chars[0]);

    return new String(chars);
  }
}
