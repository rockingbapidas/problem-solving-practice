package array;

public class FindConsecutive {

    public void find(int[] nums) {
        int maxCount = 0;
        int lastConsecutive = 0;
        for (int num : nums) {
            if (num == 1) {
                maxCount++;
            } else {
                if (lastConsecutive < maxCount) {
                    lastConsecutive = maxCount;
                }
                maxCount = 0;
            }
        }
        if (lastConsecutive < maxCount) {
            lastConsecutive = maxCount;
        }
        System.out.println("Consecutive Count " + lastConsecutive);
    }
}
