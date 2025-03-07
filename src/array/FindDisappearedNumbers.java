package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> find(int[] nums) {
        System.out.println("Original " + Arrays.toString(nums));
        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }
        System.out.println("Negative " + Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int missing = i + 1;
                list.add(missing);
            }
        }
        System.out.println("Missing " + Arrays.toString(list.toArray()));
        return list;
    }
}
