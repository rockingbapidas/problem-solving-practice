package interview.fbprep;

import java.util.List;

public class InsertionSort {
    public void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > temp) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, temp);

            //Print array logic
            printArray(arr);
        }
    }

    private void printArray(List<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print(integer +" ");
        }
        System.out.println();
    }
}
