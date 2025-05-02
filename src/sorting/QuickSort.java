package sorting;

import java.util.List;

public class QuickSort {
    public void sort(int n, int[] arr) {
        quickSort(arr, 0, n - 1);
    }

    private void quickSort(int[] arr, int lowerBound, int upperBound) {
        if (lowerBound >= upperBound) return;
        int nextPivotLocation = partition(arr, lowerBound, upperBound);
        quickSort(arr, lowerBound, nextPivotLocation - 1); // left part
        quickSort(arr, nextPivotLocation + 1, upperBound); // right part
        printArray(arr, lowerBound, upperBound);
    }

    private int partition(int[] arr, int lowerBound, int upperBound) {
        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;

        while (start < end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start < end) swap(arr, start, end);
        }

        return end;
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private void printArray(int[] arr, int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    //perform quick sort algorithm with list
    public void sort(int n, List<Integer> list) {
        quickSort(list, 0, n - 1);
    }

    public void quickSort(List<Integer> list, int lowerBound, int upperBound) {
        if (lowerBound >= upperBound) return;
        int nextPivotLocation = partition(list, lowerBound, upperBound);
        quickSort(list, lowerBound, nextPivotLocation - 1); // left part
        quickSort(list, nextPivotLocation + 1, upperBound); // right part
        printArray(list, lowerBound, upperBound);
    }

    public int partition(List<Integer> list, int lowerBound, int upperBound) {
        int pivot = list.get(lowerBound);
        int start = lowerBound;

        //put the pivot in the correct sequence (less, pivot, bigger)
        for (int i = start + 1; i <= upperBound; i++) {
            if (list.get(i) < pivot) {
                list.add(start, list.get(i));
                list.remove(i + 1);
                start++;
            }
        }

        return start;
    }

    private void printArray(List<Integer> list, int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }
}
