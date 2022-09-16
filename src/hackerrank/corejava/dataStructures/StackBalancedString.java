package hackerrank.corejava.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class StackBalancedString {
    private static final Scanner sc = new Scanner(System.in);
    public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static void main(String[] args) {
        while (sc.hasNext()) {
            String A = sc.nextLine().trim();
            boolean isBalanced = isBalanced(A);
            System.out.println(isBalanced ? "true" : "false");
        }
        sc.close();
    }

    public static boolean isBalanced(String s) {
        if (s == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (isOpenTerm(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean matches(char openTerm, char closedTerm) {
        for (char[] array : TOKENS) {
            if (array[0] == openTerm) {
                return array[1] == closedTerm;
            }
        }
        return false;
    }

    private static boolean isOpenTerm(char ch) {
        for (char[] array : TOKENS) {
            if (array[0] == ch) {
                return true;
            }
        }
        return false;
    }
}
