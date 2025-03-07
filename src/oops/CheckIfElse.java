package oops;

public class CheckIfElse {
    public void check(int N) {
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }

    public void checkCondition(int n) {
        String result = "";
        int rem = n % 2;
        if (rem == 0) {
            if (n >= 2 && n <= 5) {
                result = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                result = "Weird";
            } else {
                result = "Not Weird";
            }
        } else {
            result = "Weird";
        }
        System.out.println(result);
    }
}
