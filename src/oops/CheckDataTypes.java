package oops;

import java.util.Scanner;

public class CheckDataTypes {
    public void dataTypes(long[] t) {
        for (long x : t) {
            try {
                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");

                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(x + " can't be fitted anywhere.");
            }
        }
    }

    public void dataTypes(Scanner scan) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int num = scan.nextInt();
        double dNum = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println(num + i);
        System.out.println(dNum + d);
        System.out.println(s + str);

        scan.close();
    }
}
