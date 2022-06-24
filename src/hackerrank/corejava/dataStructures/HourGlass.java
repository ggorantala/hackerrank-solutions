package hackerrank.corejava.dataStructures;

import java.util.Scanner;

public class HourGlass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] array = new int[6][6];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = sc.nextInt();
      }
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length - 2; i++) {
      for (int j = 0; j < array[i].length - 2; j++) {
        max =
            Math.max(
                max,
                array[i][j]
                    + array[i][j + 1]
                    + array[i][j + 2]
                    + array[i + 1][j + 1]
                    + array[i + 2][j]
                    + array[i + 2][j + 1]
                    + array[i + 2][j + 2]);
      }
    }
    System.out.println(max);
  }
}
