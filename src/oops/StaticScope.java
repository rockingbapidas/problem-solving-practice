package oops;

public class StaticScope {
    static boolean flag = true;
    static int B, H;

    static {
        B = 10;
        H = 20;
        if (B > 0 && H > 0) {
            flag = true;
        } else if (B <= 0 && H >= 0 || B >= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    static void scope() {
        int[] a = new int[5];
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }

    public void initializer() {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
