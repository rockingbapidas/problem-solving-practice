package practice;

import java.util.HashSet;
import java.util.Set;

public class MatchingPairs {
    int matchingPairs(String s, String t) {
        return nonOptimize(s, t);
    }

    //Time Complexity O(n^3), Space Complexity O(1)
    private int nonOptimize(String s, String t) {
        int max = 0;
        if (s.length() != t.length()) return max;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                //Swap character
                char[] arr = s.toCharArray();
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                String replaced = new String(arr);

                //Take the matching count of new string
                int count = 0;
                for (int k = 0; k < replaced.length(); k++) {
                    if (replaced.charAt(k) == t.charAt(k)) count++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }

    //Time Complexity O(n), Space Complexity O(n)
    private int optimize(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return 0;

        int len = s.length();
        Set<Character> unmatchedS = new HashSet<>();
        Set<Character> unmatchedT = new HashSet<>();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                unmatchedS.add(s.charAt(i));
                unmatchedT.add(t.charAt(i));
            }
        }

        if (unmatchedS.isEmpty()) return len - 2;

        int res = len - unmatchedS.size();

        int contains = 0;
        for (char ch : unmatchedS) {
            if (unmatchedT.contains(ch)) {
                contains++;
                if (contains == 2) break;
            }
        }

        return res + contains;
    }
}
