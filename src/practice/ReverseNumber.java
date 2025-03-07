package practice;

public class ReverseNumber {
    public void reverse(int num) {
        int rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse number is :" + rev);
    }
}
