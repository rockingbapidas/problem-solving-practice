package array;

public class FindNumbers {

    public void find(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            int count = 0;
            int n = num;
            while (n != 0) {
                n = n / 10;
                ++count;
            }
            if ((count % 2) == 0) {
                evenCount++;
            }
        }
        System.out.println("Even Count " + evenCount);
    }
}
