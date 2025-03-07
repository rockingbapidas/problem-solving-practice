package array;

public class BitwiseAnd {
    public void bitwiseAnd(String[] arr) {
        int t = arr.length;
        for (String s : arr) {
            String[] nk = s.split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            if (((k - 1) | k) > n && k % 2 == 0) {
                System.out.println(k - 2);
            } else {
                System.out.println(k - 1);
            }
        }
    }
}
