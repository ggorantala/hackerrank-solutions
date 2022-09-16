import java.util.Scanner;

public class ItemPriceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int instancesLength = sc.nextInt();
        int[] instances = new int[instancesLength];
        int i = 0;
        while (instancesLength-- > 0) {
            instances[i++] = sc.nextInt();
        }

        int priceLength = sc.nextInt();
        double[] prices = new double[priceLength];

        int j = 0;
        while (priceLength-- > 0) {
            prices[j++] = sc.nextDouble();
        }

        if (instances.length == 1) {
            System.out.println(prices[0]);
        } else {
            for (int k = 1; k < instances.length; k++) {
                if (n == instances[k - 1]) {
                    System.out.println(prices[k]);
                } else {
                    if (n > instances[k - 1] && n < instances[k]) {
                        System.out.println();
                    }
                }
            }
        }

        sc.close();
    }
}
