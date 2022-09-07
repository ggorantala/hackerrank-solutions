package scaler.arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(product(A));
    }

    static ArrayList<Integer> product(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        int[] ps = new int[A.size()];
        int[] ss = new int[A.size()];

        ps[0] = 1;
        for (int i = 1; i < N; i++) {
            ps[i] = ps[i - 1] * A.get(i - 1);
        }

        ss[A.size() - 1] = 1;
        for (int i = N - 2; i >= 0; i--) {
            ss[i] = ss[i + 1] * A.get(i + 1);
        }

        for (int i = 0; i < N; i++) {
            result.add(ps[i] * ss[i]);
        }
        return result;
    }
}
