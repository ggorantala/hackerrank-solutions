package hackerrank.corejava.intro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currency = sc.nextDouble();
        sc.close();

        NumberFormat usaFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("USA format is " + usaFormat.format(currency));
        System.out.println("India format is " + indiaFormat.format(currency));
        System.out.println("Europe format is " + franceFormat.format(currency));
    }
}
