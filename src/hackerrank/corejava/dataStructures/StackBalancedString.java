package hackerrank.corejava.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class StackBalancedString {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (sc.hasNext()) {
      String A = sc.nextLine().trim();
      boolean isValid = isValid(A);
      System.out.println(isValid ? "true" : "false");
    }
    sc.close();
  }

  public static boolean isValid(String s) {
    if (s == null) return false;

    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') stack.push(ch);
      if (ch == ')' || ch == ']' || ch == '}') {
        if (stack.empty())
          return false;

        char top = stack.pop();

        if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
          return false;
        }
      }
    }
    return stack.empty();
  }
}
