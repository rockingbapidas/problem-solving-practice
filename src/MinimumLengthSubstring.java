import java.util.HashMap;
import java.util.Map;

public class MinimumLengthSubstring {
    int minLengthSubstring(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < t.length(); k++) {
            if (map.containsKey(t.charAt(k))) {
                map.put(t.charAt(k), map.get(t.charAt(k)) + 1);
            } else {
                map.put(t.charAt(k), 1);
            }
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!t.contains(String.valueOf(s.charAt(i)))) {
                i++;
            }

            if (!t.contains(String.valueOf(s.charAt(j)))) {
                j--;
            }

            if (t.contains(String.valueOf(s.charAt(i))) && t.contains(String.valueOf(s.charAt(j)))) {
                break;
            }
        }

        String substring = s.substring(i, j + 1);

        for (int k = 0; k < substring.length(); k++) {
            if (map.containsKey(substring.charAt(k))) {
                map.put(substring.charAt(k), map.get(substring.charAt(k)) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return -1;
            }
        }

        return substring.length();
    }
}
