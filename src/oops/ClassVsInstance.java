package oops;

import java.util.Scanner;

public class ClassVsInstance {
    public void test(Scanner scan) {
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int age = scan.nextInt();
            PersonAge p = new PersonAge(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        scan.close();
    }
}
