package interview.fbprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IceCreamParlour {
    /*
     * Complete the 'iceCreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> flavors = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int cost = arr.get(i);
            int remaining = m - cost;
            if (map.containsKey(remaining)) {
                int index = map.get(remaining);
                if (index > i) {
                    flavors.add(i + 1);
                    flavors.add(index + 1);
                } else {
                    flavors.add(index + 1);
                    flavors.add(i + 1);
                }
                return flavors;
            } else {
                map.put(cost, i);
            }
        }

        return flavors;
    }
}
