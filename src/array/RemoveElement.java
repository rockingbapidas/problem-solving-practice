package array;

import java.util.Arrays;

public class RemoveElement {

    public int remove(int[] nums, int val) {
        System.out.println(Arrays.toString(nums));
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}
