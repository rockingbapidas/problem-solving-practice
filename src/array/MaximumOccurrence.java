package array;

public class MaximumOccurrence {
    //Time Complexity O(n), Space Complexity O(1)
    public void maximumOccurrence(String string) {
        int[] freq = new int[26];

        char[] str = string.toCharArray();

        for (char c : str) {
            if (c != ' ') {
                freq[c - 'a']++;
            }
        }

        int max = 0;

        char result = 0;

        for (int i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                result = (char) (i + 'a');
            }
        }

        System.out.println("Maximum occurring character = " + result);
    }
}
