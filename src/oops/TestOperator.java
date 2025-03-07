package oops;

import java.util.Scanner;

public class TestOperator {
    public void test(Scanner scan) {
        double meal_cost = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double tip = (tip_percent * meal_cost / 100);
        double tax = (tax_percent * meal_cost / 100);
        int total = (int) Math.round(meal_cost + tip + tax);
        System.out.println(total);

        scan.close();
    }
}
