package scaler.arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 1, 2, 3, -6));
        System.out.println(getEquilibriumIndex(A));
    }

    static int getEquilibriumIndex(ArrayList<Integer> A) {
        int N = A.size();
        int[] ps = new int[N];
        int[] ss = new int[N];

        ps[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            ps[i] = ps[i - 1] + A.get(i);
        }

        ss[N-1] = A.get(N - 1);
        for(int i = N - 2; i>= 0; i--) {
            ss[i] = ss[i+ 1] + A.get(i);
        }

        System.out.println(Arrays.toString(ps));
        System.out.println(Arrays.toString(ss));

        for(int i = 0; i < N; i++) {
            if(ps[i] == ss[i]) {
                return i;
            }
        }
        return -1;
    }
}
