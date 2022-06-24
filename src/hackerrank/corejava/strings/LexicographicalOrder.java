package hackerrank.corejava.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    int k = sc.nextInt();

    sc.close();
    List<String> subStrings = new ArrayList<>();
    for (int i = 0; i < A.length() - k + 1; i++) {
      subStrings.add(A.substring(i, i + k));
    }
    Collections.sort(subStrings);
    System.out.println(subStrings.get(0));
    System.out.println(subStrings.get(subStrings.size() - 1));
  }
}
