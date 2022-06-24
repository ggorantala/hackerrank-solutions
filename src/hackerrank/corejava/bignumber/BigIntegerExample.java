package hackerrank.corejava.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger first = new BigInteger(sc.next());
    BigInteger second = new BigInteger(sc.next());

    BigInteger third, fourth;
    third = first.add(second);
    fourth = first.multiply(second);
    System.out.println(third);
    System.out.println(fourth);
  }
}
