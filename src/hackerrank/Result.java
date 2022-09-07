package hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
  public static void main(String[] args) {
    List<Integer> items = new ArrayList<>(Arrays.asList(10, 25, 50, 100, 500));
    List<Float> price = new ArrayList<>(Arrays.asList(27.32F, 23.13F, 21.25F, 18.00F, 15.50F));
    System.out.println(interpolate(2000, items, price));
  }

  public static String interpolate(int n, List<Integer> items, List<Float> price) {
    if (items.size() == 1) {
      return String.valueOf(price.get(0));
    }

    if (items.get(items.size() - 1) < n) {
      float v = Math.abs(price.get(price.size() - 1) - price.get(price.size() - 2));
      int diff = Math.abs(items.get(items.size() - 1) - items.get(items.size() - 2));
      float val =
          (float) (n - items.get(items.size() - 1)) / diff; // have this for four decimal points

      return String.valueOf(Math.round(price.get(price.size() - 1) - (v * val)));
    } else {
      for (int i = 0; i < items.size() - 1; i++) {
        if (n == items.get(i)) {
          return String.valueOf(price.get(i));
        } else {
          if (n > items.get(i) && n < items.get(i + 1)) {
            float v = Math.abs(price.get(i) - price.get(i + 1));
            int diff = Math.abs(items.get(i) - items.get(i + 1));
            float val =
                (float) (n - items.get(items.size() - 1))
                    / diff; // have this for four decimal points
            return String.valueOf(Math.round(price.get(price.size() - 1) - (v * val)));
          }
        }
      }
    }

    return "";
  }
}
