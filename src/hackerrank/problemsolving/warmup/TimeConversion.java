package hackerrank.problemsolving.warmup;

import java.util.Scanner;

public class TimeConversion {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String time = sc.next();
    String[] array = time.split(":");
    String amOrPM = array[2].substring(2, 4);

    int hh = Integer.parseInt(array[0]);
    int mm = Integer.parseInt(array[1]);
    int ss = Integer.parseInt(array[2].substring(0, 2));
    sc.close();

    String checkPM = "PM", checkAM = "AM";

    int h = hh;

    if (amOrPM.equals(checkAM) && hh == 12) {
      h = 0;
    } else if (amOrPM.equals(checkPM) && hh < 12) {
      h += 12;
    }

    System.out.printf("%02d:%02d:%02d", h, mm, ss);
  }
}
