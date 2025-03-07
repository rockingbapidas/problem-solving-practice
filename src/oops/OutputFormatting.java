package oops;

import java.util.Scanner;

public class OutputFormatting {
    public void formatting(Scanner sc) {
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            String str = String.format("%-15s", s1);
            String in = String.format("%03d", x);
            System.out.println(str + in);
        }
        System.out.println("================================");
        sc.close();
    }
}
