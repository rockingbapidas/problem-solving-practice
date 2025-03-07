package interview;

public class AgodaInterview {
    public String rleCount(String inputString) {
        String f = "";
        for (int i = 0; i < inputString.length(); i++) {
            int count = 1;
            int j = i + 1;
            while (j < inputString.length() && inputString.charAt(i) == inputString.charAt(j)) {
                count++;
                j++;
                i++;
            }
            f = f.concat(count + String.valueOf(inputString.charAt(i)));
        }
        return f;
    }
}
