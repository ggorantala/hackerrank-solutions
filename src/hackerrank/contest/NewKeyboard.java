package hackerrank.contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewKeyboard {
  private static final Scanner sc = new Scanner(System.in);
  public static char[] TOKENS = {'*', '<', '>', '#'};

  public static void main(String[] args) {
    String A = sc.nextLine();

    Map<Character, Integer> locations = new HashMap<>();
    char[] array = A.toCharArray();

    int i = 0;
    for (char ch : array) {
      int tempIndex = -1;
      int tokensIndex = isMatching(ch);
      if (tokensIndex != -1) {
        if(tokensIndex == 0) {
          tempIndex = i - 1;
//          locations.put()
        }
      } else {
        locations.put(ch, i++);
      }
    }

    sc.close();
  }

  private static int isMatching(char ch) {
    for (int i = 0; i < TOKENS.length; i++) {
      if (TOKENS[i] == ch) {
        return i;
      }
    }
    return -1;
  }
}
