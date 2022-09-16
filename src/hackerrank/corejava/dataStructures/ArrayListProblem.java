package hackerrank.corejava.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), d, q, x, y;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d = in.nextInt();
            list.add(i, new ArrayList<>());
            for (int j = 0; j < d; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        q = in.nextInt();
        for (int i = 0; i < q; i++) {
            x = in.nextInt();
            y = in.nextInt();
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
