package oops;

import java.util.Scanner;

public class TestGenerics {
    public void test(Scanner scan) {
        int n = scan.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scan.nextInt();
        }

        n = scan.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scan.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
        scan.close();
    }
}
