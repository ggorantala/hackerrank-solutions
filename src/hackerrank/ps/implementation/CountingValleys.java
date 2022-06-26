package hackerrank.ps.implementation;

import java.util.Scanner;

public class CountingValleys {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    sc.nextLine();
    String steps = sc.nextLine();

    int seaLevel = 0;
    int valleys = 0;

    for (int ch : steps.toCharArray()) {
      if (ch == 'D') seaLevel--;
      else seaLevel++;
      if (seaLevel == 0 && ch == 'U') ++valleys;
    }
    System.out.println(valleys);

    sc.close();
  }
}
