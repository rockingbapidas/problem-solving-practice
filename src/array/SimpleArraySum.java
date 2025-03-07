package array;

import java.util.List;

public class SimpleArraySum {
    public int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer integer : ar) {
            sum = sum + integer;
        }
        return sum;
    }
}
