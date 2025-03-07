package interview;

public class ByjusInterview {

    public void fuzzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 2 == 0) && (i % 5 == 0)) {
                System.out.println("FUZZ BUZZ");
            } else if ((i % 2 == 0)) {
                System.out.println("FUZZ");
            } else if ((i % 5 == 0)) {
                System.out.println("BUZZ");
            } else {
                System.out.println("Nothing");
            }
        }
    }

    public void minimumSwap(int[] arr) {
        int count = 0, first = 0, second = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
                if (first == 0)
                    first = i;
                else
                    second = i;
            }
        }

        if (count == 2) {
            int temp = arr[first - 1];
            arr[first - 1] = arr[second];
            arr[second] = temp;
        } else if (count == 1) {
            int temp = arr[first - 1];
            arr[first - 1] = arr[first];
            arr[first] = temp;
        } else {
            return;
        }

        display(arr);
    }

    public void checkArrayOrder(int[] arr) {
        boolean ascending = false, descending = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                descending = true;
            } else if (arr[i - 1] < arr[i]) {
                ascending = true;
            }
        }

        if (ascending & descending) {
            System.out.println("Ascending Descending");
        } else if (ascending) {
            System.out.println("Ascending");
        } else if (descending) {
            System.out.println("Descending");
        } else {
            System.out.println("None");
        }
    }

    private void testArray() {
        int[] arr = new int[]{2, 4, 5, 6};
        multiplyArray(arr);
        addArray(arr);
        display(arr);
    }

    private void multiplyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    private void addArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;
        }
    }

    private void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j);
        }
    }
}