package oops;

public class CustomException {
    public int power(int base, int power) throws Exception {
        if (base < 0 || power < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(base, power);
    }
}
