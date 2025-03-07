package interview;

import java.util.*;

public class WalmartInterview {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    public boolean balancedBrackets(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String bracket = String.valueOf(s.charAt(i));

            if (bracket.equals("(") ||bracket.equals("[") || bracket.equals("{")) {
                stack.push(bracket);
            } else {
                String open = stack.isEmpty() ? "" : stack.peek();
                if (bracket.equals(")") && open.equals("(")) {
                    stack.pop();
                } else if (bracket.equals("]") && open.equals("[")) {
                    stack.pop();
                } else if (bracket.equals("}") && open.equals("{")) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    public String longestCommonPrefix(String[] strings) {
        if (strings == null) return "";
        if (strings.length == 1) return strings[0];
        String result = "";
        for (int i = 0; i < strings[0].length(); i++) {
            char first = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                char sub = strings[j].charAt(i);
                if (first != sub) {
                    return result;
                }
            }
            result = result.concat(String.valueOf(strings[0].charAt(i)));
        }
        return result;
    }

    public List<List<String>> groupAnagram(String[] arr) {
        if (arr == null) return null;
        if (arr.length == 1) return List.of(List.of(arr[0]));
        List<List<String>> res = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String string : arr) {

            //Convert string to char array
            char[] element = string.toCharArray();

            //Sort string to alphabetic order
            Arrays.sort(element);

            //Convert sorted char to string
            String key = String.valueOf(element);

            //Check map contains sorted string as key or not
            if (!map.containsKey(key)) {
                //If not contains store sorted key followed by actual string as value
                map.put(key, List.of(string));
            } else {
                //If there get the key values
                List<String> values = new ArrayList<>(map.get(key));
                //Add current actual string and update key values
                values.add(string);
                map.put(key, values);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            res.add(stringListEntry.getValue());
        }

        return res;
    }

    public int findMissingNumber(int[] arr, int N) {
        int sum = (N * (N + 1)) / 2;
        for (int j : arr) {
            sum -= sum - j;
        }
        return sum;
    }

    public boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else  {
                map.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if (characterIntegerEntry.getValue() != 0)
                return false;
        }

        return true;
    }
}
