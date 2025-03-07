package array;

import java.util.Arrays;

public class RemoveDuplicates {

    public int remove(int[] nums) {
        System.out.println(Arrays.toString(nums) + "\n");
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}
