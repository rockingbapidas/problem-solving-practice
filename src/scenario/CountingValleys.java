package scenario;

public class CountingValleys {
    public static int count(int n, String s) {
        int result = 0; // # of valleys
        int lvl = 0; // current level
        for (char c : s.toCharArray()) {
            if (c == 'U')
                ++lvl;
            if (c == 'D')
                --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && c == 'U')
                ++result;
        }
        return result;
    }
}
