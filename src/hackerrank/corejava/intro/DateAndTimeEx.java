package hackerrank.corejava.intro;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTimeEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int month = sc.nextInt();
    int day = sc.nextInt();
    int year = sc.nextInt();

    System.out.println(findDay(month, day, year));
  }

  public static String findDay(int month, int day, int year) {
    return LocalDate.of(year, month, day).getDayOfWeek().name();
  }
}
