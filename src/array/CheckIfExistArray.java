package array;

import java.util.HashMap;

public class CheckIfExistArray {

    public boolean checkIf(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (map.containsKey(arr[i] * 2)) {
                    if (map.get(arr[i] * 2) != i) {
                        return true;
                    }
                } else if (map.containsKey(arr[i] / 2)) {
                    if (map.get(arr[i] / 2) != i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
