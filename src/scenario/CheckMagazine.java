package scenario;

import java.util.Hashtable;

public class CheckMagazine {
    public void check(String[] magazine, String[] note) {
        int count = 0;
        Hashtable<String, Integer> magazineWords = new Hashtable<String, Integer>();
        for (String s : magazine) {
            if (magazineWords.containsKey(s)) {
                magazineWords.put(s, magazineWords.get(s) + 1);
            } else {
                magazineWords.put(s, 1);
            }
        }
        for (String s : note) {
            if (!magazineWords.containsKey(s)) {
                count++;
                break;
            }
            int counter = magazineWords.get(s) - 1;
            if (counter == 0) {
                magazineWords.remove(s);
            } else {
                magazineWords.put(s, counter);
            }
        }
        if (count > 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
