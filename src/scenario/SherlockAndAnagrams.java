package scenario;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
 * Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 */
public class SherlockAndAnagrams {
    public int check(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int totalCount = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);

                char[] chars = currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString = String.valueOf(chars);

                if (map.containsKey(currentSubString)) {
                    int value = map.get(currentSubString);
                    totalCount = totalCount + value;

                    map.put(currentSubString, value + 1);
                } else {
                    map.put(currentSubString, 1);
                }
            }
        }
        return totalCount;
    }
}
