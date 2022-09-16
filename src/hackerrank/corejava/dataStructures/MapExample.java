package hackerrank.corejava.dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>(T);

        while (T-- > 0) {
            String name = sc.nextLine().trim();
            int phone = sc.nextInt();
            sc.nextLine();
            map.put(name, phone);
        }

        while (sc.hasNext()) {
            String query = sc.nextLine().trim();
            if (map.containsKey(query)) {
                System.out.println(query + "=" + map.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
