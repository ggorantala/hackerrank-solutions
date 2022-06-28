package hackerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ScopeExample {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();

    List<Integer> input = new ArrayList<>();
    while (T-- > 0) {
      input.add(sc.nextInt());
    }

    Scope scope = new Scope(input);
    scope.computeDifference();
    System.out.println(scope.getMaximumDifference());

    sc.close();
  }
}

class Scope {
  private final List<Integer> __elements;
  private int maximumDifference;

  public Scope(List<Integer> __elements) {
    this.__elements = __elements;
  }

  public void computeDifference() {
    Collections.sort(this.__elements);
    this.maximumDifference =
        Math.abs(this.__elements.get(this.__elements.size() - 1) - this.__elements.get(0));
  }

  public int getMaximumDifference() {
    return maximumDifference;
  }

  public void setMaximumDifference(int maximumDifference) {
    this.maximumDifference = maximumDifference;
  }
}
