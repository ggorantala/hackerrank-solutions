package hackerrank.corejava.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            array.add(val);
        }

        int queries = sc.nextInt();

        while (queries-- > 0) {
            String A = sc.next();
            int el;
            int index;
            if (A.equals("Insert")) {
                index = sc.nextInt();
                el = sc.nextInt();
                array.add(index, el);
            } else {
                index = sc.nextInt();
                array.remove(index);
            }
        }

        for (int el : array) {
            System.out.print(el + " ");
        }
    }
}
