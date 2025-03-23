package scenario;

import java.util.*;

public class SnakeLadderGame {
    public int quickestWayUp(List<List<Integer>> ladders, List<List<Integer>> snakes) {
        Map<Integer, Integer> mLadderPos = new HashMap<>();
        Map<Integer, Integer> mSnackPos = new HashMap<>();
        for (List<Integer> ladder : ladders) {
            mLadderPos.put(ladder.get(0), ladder.get(1));
        }
        for (List<Integer> snake : snakes) {
            mSnackPos.put(snake.get(0), snake.get(1));
        }
        return rollDice(mLadderPos, mSnackPos);
    }

    private int rollDice(Map<Integer, Integer> mLadderPos, Map<Integer, Integer> mSnackPos) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> visited = new HashMap<>();

        visited.put(1, 0);
        queue.add(1);

        while (!queue.isEmpty()) {
            Integer element = queue.remove(); // 1, 2, 3, 4
            if (element == 100) {
                return visited.get(100);
            }

            for (int i = 1; i <= 6; i++) {
                Integer pos = i + element; // 5, 6, 7, 8, 9
                if (mLadderPos.containsKey(pos)) {
                    pos = mLadderPos.get(pos);
                } else if (mSnackPos.containsKey(pos)) {
                    pos = mSnackPos.get(pos);
                }

                int distance = visited.get(element) + 1;
                if (!visited.containsKey(pos)) {
                    visited.put(pos, distance);
                    queue.add(pos);
                } else if (distance < visited.get(pos)) {
                    visited.put(pos, distance);
                }
            }
        }

        return -1;
    }
}
