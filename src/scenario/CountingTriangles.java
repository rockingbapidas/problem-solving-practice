package scenario;

import java.util.ArrayList;

public class CountingTriangles {
    static class Sides {
        int a;
        int b;
        int c;

        Sides(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        int sum() {
            return a + b + c;
        }
    }

    int countDistinctTriangles(ArrayList<Sides> arr) {
        return optimize(arr);
    }

    private int nonOptimize(ArrayList<Sides> arr) {
        int[] a = new int[arr.size()];
        int ans = arr.size();

        for (int i = 0; i < arr.size() - 1; i++) {
            a[i] = arr.get(i).sum();
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                ans--;
            }
        }
        return ans;
    }

    private int optimize(ArrayList<Sides> arr) {
        int ans = arr.size();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).sum() == arr.get(i + 1).sum()) {
                ans--;
            }
        }
        return ans;
    }
}
