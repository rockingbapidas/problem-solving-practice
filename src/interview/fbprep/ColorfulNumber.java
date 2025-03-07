package interview.fbprep;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber { //3245
    public boolean isColorFul(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Set<Integer> set = new HashSet<>();
        int groupingOf = 1;

        while (groupingOf <= arr.length) {
            for (int i = arr.length - 1; i >=0 ; i--) {
                int product = Integer.parseInt(String.valueOf(arr[i]));
                boolean outOfBound = false;

                for (int j = i - 1; j >= i - (groupingOf - 1); j--) {
                    if (j < 0) {
                        outOfBound = true;
                        break;
                    }
                    product *= Integer.parseInt(String.valueOf(arr[j]));
                }

                if (set.contains(product) && !outOfBound) {
                    return false;
                } else {
                    set.add(product);
                }
            }
            groupingOf++;
        }

        return true;
    }
}
