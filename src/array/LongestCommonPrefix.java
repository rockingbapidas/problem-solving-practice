package array;

import org.jetbrains.annotations.NotNull;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Explanation: There is no common prefix amongst the input strings.
 */
public class LongestCommonPrefix {
    public String solution(String[] strs) {
        return bruteForce(strs);
    }

    //Brute Force Solution
    private String bruteForce(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[j].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    //Efficient Solution
    private String optimize(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
