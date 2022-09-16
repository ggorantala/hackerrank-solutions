package hackerrank.corejava.dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetExample {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int N = get.nextInt();
        int M = get.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        BitSet[] bitset = new BitSet[3];

        bitset[1] = B1;
        bitset[2] = B2;

        while (M-- > 0) {
            String op = get.next();
            int x = get.nextInt();
            int y = get.nextInt();

            switch (op) {
                case "AND" -> bitset[x].and(bitset[y]);
                case "OR" -> bitset[x].or(bitset[y]);
                case "XOR" -> bitset[x].xor(bitset[y]);
                case "FLIP" -> bitset[x].flip(y);
                case "SET" -> bitset[x].set(y);
            }

            System.out.printf("%d %d%n", B1.cardinality(), B2.cardinality());
        }
    }
}
