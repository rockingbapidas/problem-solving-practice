package string;

import java.util.HashMap;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        return nonOptimize1(s);
    }

    private int optimize(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int ans = 0;
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            ans = Math.max(ans,  right - left + 1);
            right++;
        }
        return ans;
    }

    private int nonOptimize1(String s) {
        int i = 0;
        int j = s.length() - 1;
        String result = s.substring(i, j + 1);

        while (i < j) {
            String substring = s.substring(i, j);
            String value = String.valueOf(s.charAt(j));
            if (substring.contains(value)) {
                j--;
            }

            result = s.substring(i, j + 1);
            if (isUnique(result))
                break;
            else {
                i++;
            }
        }

        return result.length();
    }

    private int nonOptimize(String s) {
        if (s == null || s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isUnique(sub))
                    ans = Math.max(ans, sub.length());
            }
        }
        return ans;
    }

    private boolean isUnique(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        return true;
    }
}
