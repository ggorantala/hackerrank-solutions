package hackerrank.ps.strings;

import java.util.Arrays;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String A = sc.next();
            System.out.println(isFunny(A) ? "Funny" : "Not Funny");
        }


    }

    private static boolean isFunny(String A) {
        char[] chars = A.toCharArray();
        int[] array = new int[A.length()];

        for (int i = 0; i < A.length(); i++) {
            array[i] = chars[i];
        }
        System.out.println(Arrays.toString(array));

        return false;
    }


}
