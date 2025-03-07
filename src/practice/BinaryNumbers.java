package practice;

public class BinaryNumbers {
    public void binaryNumbers(int n ) {
        int remainder = 0, maxCount = 0, lastMaxCount = 0;
        while (n > 0) {
            remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                maxCount++;
                if (maxCount >= lastMaxCount)
                    lastMaxCount = maxCount;
            } else {
                maxCount = 0;
            }
        }
        System.out.println(lastMaxCount);
    }
}
