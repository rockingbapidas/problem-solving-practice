package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {
    public long find(long n, String s) {
        Matcher matcher = Pattern.compile(String.valueOf('a')).matcher(s);
        int aInInput = 0;
        while (matcher.find()) {
            aInInput++;
        }
        long totalA = 0L;
        if (s.equals("a")) {
            totalA = n;
        } else {
            totalA = totalA + ((n / s.length()) * aInInput);
            for (int i = 0; i < (n % s.length()); i++) {
                if (s.charAt(i) == 'a') {
                    totalA++;
                }
            }
        }
        return totalA;
    }
}
