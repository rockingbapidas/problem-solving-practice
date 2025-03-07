package string;

import java.util.Locale;

public class RomanToIntProblem {
    public int romanToInt(String s) {
        int result = 0;
        String temp = s.toUpperCase(Locale.ROOT);
        for (int i = 0; i < temp.length(); i++) {
            String current = String.valueOf(temp.charAt(i));
            result = result + getRomanValue(current);
            if (i >= 1) {
                String prev = String.valueOf(temp.charAt(i - 1));
                if (current.equals("V") && prev.equals("I")) {
                    int I = getRomanValue("I");
                    int v = getRomanValue("V");
                    result = result - (I + v);
                    result = result + (v - I);
                } else if (current.equals("X") && prev.equals("I")) {
                    int I = getRomanValue("I");
                    int x = getRomanValue("X");
                    result = result - (I + x);
                    result = result + (x - I);
                } else if (current.equals("L") && prev.equals("X")) {
                    int x = getRomanValue("X");
                    int l = getRomanValue("L");
                    result = result - (x + l);
                    result = result + (l - x);
                } else if (current.equals("C") && prev.equals("X")) {
                    int x = getRomanValue("X");
                    int c = getRomanValue("C");
                    result = result - (x + c);
                    result = result + (c - x);
                } else if (current.equals("D") && prev.equals("C")) {
                    int c = getRomanValue("C");
                    int d = getRomanValue("D");
                    result = result - (c + d);
                    result = result + (d - c);
                } else if (current.equals("M") && prev.equals("C")) {
                    int c = getRomanValue("C");
                    int m = getRomanValue("M");
                    result = result - (c + m);
                    result = result + (m - c);
                }
            }
        }
        return result;
    }

    private int getRomanValue(String ch) {
        switch (ch) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
        }
        return 0;
    }
}
