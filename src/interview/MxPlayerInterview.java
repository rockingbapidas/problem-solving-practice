package interview;

import java.util.*;

public class MxPlayerInterview {
    /*
     * Problem Statement                                            *
     * Have the function SearchingChallenge(str) take the str parameter	*
     * being passed and return 1 if the brackets are correctly	*
     * matched and each one is accounted for. Otherwise, return 0.	*
     * For example: if str is "(hello (world))", then the output	*
     * should be 1, but if str is "((hello (world))" the the output	*
     * should be 0 because the brackets do not correctly match up.	*
     * Only "(" and ")" will be used as brackets. If str contains	*
     * no brackets return 1.    					*
     *                                                              *
     * Examples                                                     *
     * Input 1: "(coder)(byte))"                                    *
     * Output 1: 0                                                  *
     *                                                              *
     * Input 2: "(c(oder)) b(yte)"                                  *
     * Output 2: 1
     */
    public String SearchingChallenge(String str) {
        Stack<String> stack = new Stack<>();
        int pair = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32 || str.charAt(i) >= 97) continue;
            String bracket = String.valueOf(str.charAt(i));
            if (bracket.equals("(") || bracket.equals("[")) {
                stack.push(bracket);
            } else {
                String open = stack.isEmpty() ? "" : stack.peek();
                if (bracket.equals(")") && open.equals("(")) {
                    stack.pop();
                    pair++;
                } else if (bracket.equals("]") && open.equals("[")) {
                    stack.pop();
                    pair++;
                } else {
                    return "0";
                }
            }
        }
        return stack.isEmpty() ? "1 " + pair : "0";
    }

    /*
    Have the function ArrayChallenge(strArr) read the strArr parameter being passed which will represent a full day
    and will be filled with events that span from time X to time Y in the day. The format of each event will be
    hh:mmAM/PM-hh:mmAM/PM. For example, strArr may be ["10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM"].
    Your program will have to output the longest amount of free time available between the start of your first
    event and the end of your last event in the format: hh:mm. The start event should be the earliest event in
    the day and the latest event should be the latest event in the day. The output for the previous input would
    therefore be 01:30 (with the earliest event in the day starting at 09:10AM and the latest event ending at 02:45PM).
    The input will contain at least 3 events and the events may be out of order.
     */
    public String ArrayChallenge(String[] strArr) {
        List<Integer> list = new ArrayList<>();

        for (String period : strArr) {
            String[] times = period.split("-");
            list.add(parseTotalTime(times[0]));
            list.add(parseTotalTime(times[1]));
        }

        list.sort(Comparator.comparingInt(value -> value));

        int mostFree = 0;

        for (int i = 1; i < list.size() - 1; ) {
            int res = list.get(i + 1) - list.get(i);
            mostFree = Math.max(res, mostFree);
            i += 2;
        }

        return String.format("%02d:%02d", mostFree / 60, mostFree % 60);
    }

    private int parseTotalTime(String times) {
        String[] time = times.split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1].substring(0, 2));
        String emeried = time[1].substring(2, 4).toUpperCase(Locale.ROOT);

        int totalMinutes = hours * 60 + minutes;
        if (Objects.equals(emeried, "PM") && hours < 12)
            totalMinutes += 12 * 60;
        return totalMinutes;
    }

    /*
    Have the function GameChallenge(strArr) take the strArr parameter being passed which will be an array of
    size eleven. The array will take the shape of a Tic-tac-toe board with spaces strArr[3] and strArr[7]
    being the separators ("<>") between the rows, and the rest of the spaces will be either "X", "O", or "-"
    which signifies an empty space. So for example strArr may be ["X","O","-","<>","-","O","-","<>","O","X","-"].
    This is a Tic-tac-toe board with each row separated double arrows ("<>"). Your program should output the space
    in the array by which any player could win by putting down either an "X" or "O". In the array above, the output
    should be 2 because if an "O" is placed in strArr[2] then one of the players wins. Each board will only have one
    solution for a win, not multiple wins. Your output should never be 3 or 7 because those are the separator spaces.
     */
    public String GameChallenge(String[] strArr) {
        // code goes here
        return strArr[0];
    }
}
