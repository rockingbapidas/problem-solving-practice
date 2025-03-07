package array;

import java.util.ArrayList;
import java.util.List;

public class HourGlassSum {
    private int sum(int[][] arr) {
        List<Integer> new_arr = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                sum = sum + arr[i + 1][j + 1];
                sum = sum + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                new_arr.add(sum);
            }
        }

        for(int i = 0; i < new_arr.size(); i++) {
            for (int j = 0; j < new_arr.size() - 1; j++) {
                if (new_arr.get(j) > new_arr.get(j + 1)) {
                    int temp = new_arr.get(j);
                    new_arr.set(j, new_arr.get(j + 1));
                    new_arr.set(j + 1, temp);
                }
            }
        }
        return new_arr.get(new_arr.size() - 1);
    }
}
