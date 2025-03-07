package scenario;

public class CoinHeadCount {
    public int[] solution(String coins) {
        int[] headCount = new int[coins.length()];
        String lastCoin = "";
        for (int i = 0; i < coins.length(); i++) {
            String c = String.valueOf(coins.charAt(i));
            if (c.equals("H")) {
                c = "T";
            } else {
                c = "H";
            }
            int pos = headCount[i];
            if (lastCoin.equals("H")) {
                pos = headCount[i] - 1;
            }
            lastCoin = c;
            if (lastCoin.equals("H")) {
                headCount[pos] = headCount[pos]++;
            }
        }
        return headCount;
    }
}
