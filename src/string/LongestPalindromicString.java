package string;

public class LongestPalindromicString {
    public String longestPalindrome(String s) {
        return bruteForce(s);
    }

    private String optimize(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    private String bruteForce(String s) {
        if (s == null || s.isEmpty()) return "";
        if (s.length() == 1) return s;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                int start = 0;
                int end = sub.length() - 1;
                while (start < end && sub.charAt(start) == sub.charAt(end)) {
                    start++;
                    end--;
                }

                if (start >= end ) {
                    if (ans.length() < sub.length()) {
                        ans = sub;
                    }
                }
            }
        }
        if (ans.isEmpty()) return String.valueOf(s.charAt(0));
        return ans;
    }
}
