package string;

import java.util.Arrays;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 * Input: s = "A", numRows = 1
 * Output: "A"
 */

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        char[] str_Char = s.toCharArray();
        int len = s.length();
        String[] arr = new String[numRows];
        Arrays. fill(arr, "");
        int row = 0;
        boolean direction = true;
        for (int i = 0; i < len; i++) {
            arr[row] = arr[row] + str_Char[i];

            if (row == numRows - 1) {
                direction = false;
            }

            if (row == 0) {
                direction = true;
            }

            if (direction) {
                row++;
            } else {
                row--;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(arr[i]);
        }
        return res.toString();
    }

    public String convert_2(String s, int numRows){
        if (numRows == 1) return s;
        String res = "";
        for (int i = 0; i < numRows; i++) {
            int increment = 2 * (numRows - 1);
            for (int j = 0; j < s.length(); j++) {
                res = res.concat(String.valueOf(s.charAt(j)));
                if (i > 0 && i < numRows - 1 && j + increment - 2 * i < s.length()) {
                    res = res.concat(String.valueOf(s.charAt(j + increment - 2 * i)));
                }
            }
        }
        return res;
    }
}
