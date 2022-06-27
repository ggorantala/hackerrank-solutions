package hackerrank.certs;

import java.util.*;

public class AnagramsArray {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    sc.nextLine();
    String[] t = new String[T];
    int i = 0;
    while (T-- > 0) {
      t[i++] = sc.next();
    }

    int S = sc.nextInt();
    sc.nextLine();
    String[] s = new String[S];
    int j = 0;
    while (S-- > 0) {
      s[j++] = sc.next();
    }
    Map<String, List<String>> memo = new HashMap<>();

    for (int k = 0; k < t.length; k++) {
      char[] chars = t[k].toCharArray();
      Arrays.sort(chars);
      String newString = new String(chars);
      if (memo.containsKey(newString)) {
        memo.get(newString).add(t[k]);
      } else {
        memo.put(newString, new ArrayList<>(Arrays.asList(t[k])));
      }
    }

    System.out.println(memo);

    for (String value : s) {
      char[] chars = value.toCharArray();
      Arrays.sort(chars);
      String q = new String(chars);
      if (memo.containsKey(q)) {
        System.out.println(memo.get(q).size());
      } else {
        System.out.println(0);
      }
    }
    sc.close();
  }
}
