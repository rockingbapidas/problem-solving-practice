package array;

import java.util.HashMap;

public class ReverseToMakeEqual {
    boolean areTheyEqual(int[] array_a, int[] array_b) {
        return optimize(array_a, array_b);
    }

    //Time Complexity O(n * n) and Space Complexity O(1)
    private boolean nonOptimize(int[] array_a, int[] array_b){
        if (array_a.length != array_b.length) return false;
        for (int i = 0; i < array_a.length; i++) {
            if (array_a[i] != array_b[i]) {
                for (int j = i + 1; j < array_b.length; j++) {
                    if (array_a[i] == array_b[j]) {
                        int temp = array_b[i];
                        array_b[i] = array_b[j];
                        array_b[j] = temp;
                        break;
                    }
                    if (j == array_b.length - 1) return false;
                }
            }
        }
        return true;
    }

    //Todo need to complete this method this one is wrong for some test case
    private boolean nonOptimize1(int[] array_a, int[] array_b){
        if (array_a.length != array_b.length) return false;

        int left = 0;
        int right = array_b.length - 1;

        while (array_a[left] == array_b[left]) {
            left++;
        }

        while (array_a[right] == array_b[right]) {
            right--;
        }

        while (left < right) {
            int temp = array_b[right];
            array_b[right] = array_b[left];
            array_b[left] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < array_a.length; i++) {
            if (array_a[i] != array_b[i]) return false;
        }

        return true;
    }

    private boolean optimize(int[] array_a, int[] array_b) {
        if (array_a.length != array_b.length) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : array_a) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        for (int j : array_b) {
            if (map.containsKey(j) && map.get(j) > 0) {
                map.put(j, map.get(j) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
