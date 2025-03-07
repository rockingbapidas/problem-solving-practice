package oops;

public class ExceptionsStringToInteger {
    public void test(String S) {
        try {
            int value = Integer.parseInt(S);
            System.out.println(value);
        } catch (Exception exception) {
            System.out.println("Bad String");
        }
    }
}
