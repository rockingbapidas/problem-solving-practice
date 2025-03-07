package hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
    public long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> itemWithCount = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;

        for (long a : arr) {
            long key = a / r;

            if (counter.containsKey(key) && a % r == 0) {
                count += counter.get(key);
            }

            if (itemWithCount.containsKey(key) && a % r == 0) {
                long c = itemWithCount.get(key);
                counter.put(a, counter.getOrDefault(a, 0L) + c);
            }

            itemWithCount.put(a, itemWithCount.getOrDefault(a, 0L) + 1);
        }

        return count;
    }
}
