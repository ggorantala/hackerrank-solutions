package hackerrank.ps.implementation;

import java.util.Scanner;

public class KangarooJumps {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();

        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if (canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if (willIntersectOnLand) {
                response = "YES";
            }
        }

        System.out.println(response);
        sc.close();
    }
}
