package array;

public class OddEven {
    public void check(String[] strArr) {
        for (String s: strArr){
            char[] arr = s.toCharArray();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    even.append(arr[i]);
                } else {
                    odd.append(arr[i]);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
