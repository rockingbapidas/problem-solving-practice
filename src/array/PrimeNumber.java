package array;

public class PrimeNumber {
    public void checkPrime(int[] arr) {
        for (int num : arr) {
            if (num == 1) {
                System.out.println("Not prime");
                continue;
            }
            boolean flag = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}
