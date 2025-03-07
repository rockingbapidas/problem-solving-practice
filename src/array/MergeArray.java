package array;

import java.util.Arrays;

public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("nums1 " + Arrays.toString(nums1));
        System.out.println("nums2 " + Arrays.toString(nums2));
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[j] != 0) {
                        nums1[i] = nums2[j];
                        nums2[j] = 0;
                        break;
                    }
                }
            }
        }
        int temp = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        System.out.println("Final " + Arrays.toString(nums1));
    }
}
