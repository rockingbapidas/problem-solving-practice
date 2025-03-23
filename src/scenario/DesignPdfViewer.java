package scenario;

import java.util.List;

public class DesignPdfViewer {
    public int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int pos = (word.charAt(i) - 'a');
            if (h.get(pos) > max) max = h.get(pos);
        }
        return max * word.length();
    }
}
