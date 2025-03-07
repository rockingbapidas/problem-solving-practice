package interview.fbprep;

/*
Write a function that returns whether two words are exactly "one edit" away using the following signature:
bool OneEditApart(string s1, string s2);
An edit is:
Inserting one character anywhere in the word (including at the beginning and end)
Removing one character
Replacing one character
Examples:
OneEditApart("cat", "dog") = false
OneEditApart("cat", "cats") = true
OneEditApart("cat", "cut") = true
OneEditApart("cat", "cast") = true
OneEditApart("cat", "at") = true
OneEditApart("cat", "act") = false
 */
public class EditDistance {
    public boolean OneEditApart(String s1, String s2) {
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if (s2.length() - s1.length() > 1) return false;
        int i = 0;
        int j = 0;
        boolean sawDifference = false;
        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (sawDifference) return false;
                sawDifference = true;
                if (s2.length() > s1.length()) {
                    i--;
                }
            }
            j++;
            i++;
        }
        return sawDifference || s2.length() != s1.length();
    }
}
