package oops;

import java.util.Scanner;

public class TestArray {
    public void arrays(Scanner scan) {
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
