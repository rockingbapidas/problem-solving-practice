package oops;

import java.util.Scanner;

public class NestedCondition {

    public void test(Scanner scan) {
        int AD = scan.nextInt();
        int AM = scan.nextInt();
        int AY = scan.nextInt();

        int ED = scan.nextInt();
        int EM = scan.nextInt();
        int EY = scan.nextInt();

        int totalHacks = 0;

        if (AY > EY) {
            totalHacks = 10000;
        } else {
            if (AM > EM && AY == EY) {
                totalHacks = (AM - EM) * 500;
            } else if (AD > ED && AM == EM) {
                totalHacks = (AD - ED) * 15;
            }
        }
        System.out.print(totalHacks);
        scan.close();
    }
}
