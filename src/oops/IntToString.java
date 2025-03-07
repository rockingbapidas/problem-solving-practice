package oops;

public class IntToString {
    public void convert(int n) {
        try {
            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
