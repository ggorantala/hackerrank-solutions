package hackerrank.ps.implementation;

import java.util.Scanner;

public class GradingStudents {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        int i = 0;

        int[] grades = new int[T];

        while (T-- > 0) {
            grades[i++] = sc.nextInt();
        }

        for (int grade : grades) {
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int next = grade / 5 + 1;
                int val = next * 5 - grade;
                if (val < 3) {
                    System.out.println(next * 5);
                } else {
                    System.out.println(grade);
                }
            }
        }

        sc.close();
    }
}
