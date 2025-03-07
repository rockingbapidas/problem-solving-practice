package oops;

import java.util.Scanner;

public class CheckLoop {
    public void loop(Scanner in) {
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int last = 0;
            int current = 1;
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (last == 0)
                    last += a + (current * b);
                else
                    last += current * b;
                result.append(last).append(" ");
                current = current + current;
            }
            System.out.println(result);
        }
        in.close();
    }

    public void loop(int N) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }

    public void loops(Scanner scan) {
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scan.close();
    }
}
