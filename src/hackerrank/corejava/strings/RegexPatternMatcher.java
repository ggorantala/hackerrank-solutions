package hackerrank.corejava.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatternMatcher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());

    while (T-- > 0) {
      String pattern = sc.nextLine();
      try {
        Pattern.compile(pattern);
        System.out.println("Valid");
      } catch (PatternSyntaxException e) {
        System.out.println("Invalid");
      }
    }
    sc.close();
  }
}
