package oops;

import java.util.Scanner;

public class CheckEndOfFile {
    public void checkOfEof(Scanner scan) {
        int i = 0;
        while (scan.hasNext()) {
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
        scan.close();
    }
}
