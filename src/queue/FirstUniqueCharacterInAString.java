package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Queue<String> allChars = new LinkedList<>();
        Queue<String> uniqueChars = new LinkedList<>();
        Queue<String> duplicateChars = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (allChars.contains(currentChar)) {
                uniqueChars.remove(currentChar);
                duplicateChars.add(currentChar);
            } else {
                allChars.add(currentChar);
                uniqueChars.add(currentChar);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (uniqueChars.contains(currentChar) && !duplicateChars.contains(currentChar)) {
                return i;
            }
        }
        return -1;
    }
}
