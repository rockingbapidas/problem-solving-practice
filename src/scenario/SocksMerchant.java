package scenario;

import java.util.HashSet;
import java.util.Set;

public class SocksMerchant {
    public int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<Integer>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            } else {
                result++;
                colors.remove(ar[i]);
            }
        }
        return result;
    }
}
