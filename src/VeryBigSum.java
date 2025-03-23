import java.util.List;

public class VeryBigSum {
    public long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (Long aLong : ar) {
            sum += aLong;
        }
        return sum;
    }
}
