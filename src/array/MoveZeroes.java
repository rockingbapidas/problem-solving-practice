package array;

import java.util.Arrays;

public class MoveZeroes {

    public void move(int[] nums) {
        System.out.println(Arrays.toString(nums) + "\n");
        int writePointer = 0;
        int zero = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            } else {
                zero++;
            }
        }
        System.out.println(Arrays.toString(nums));
        while (zero > 0) {
            nums[nums.length - zero] = 0;
            zero--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
