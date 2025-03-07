package oops;

import java.util.Scanner;

public class StdInStdOut {
    public void stdInStdOut(Scanner scan) {
        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public void stdInToStdOut(Scanner scan) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
