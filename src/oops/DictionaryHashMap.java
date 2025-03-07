package oops;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryHashMap {
    public void test(Scanner scan) {
        int n = scan.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int phone = scan.nextInt();
            map.put(name, phone);
        }
        while (scan.hasNext()) {
            String s = scan.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
