package string;

public class CheckTwoString {
    public String twoStrings(String s1, String s2) {
        boolean found = false;
        int a = 97;
        int az = a + 25;
        for (int i = a; i < az; i++) {
            if (s1.indexOf(i) != -1 && s2.indexOf(i) != -1) {
                found = true;
                break;
            }
        }
        if (found) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
