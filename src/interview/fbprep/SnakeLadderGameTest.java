package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SnakeLadderGameTest {
    private SnakeLadderGame snakeLadderGame;

    @BeforeEach
    void setUp() {
        snakeLadderGame = new SnakeLadderGame();
    }

    @AfterEach
    void tearDown() {
        snakeLadderGame = null;
    }

    @Test
    void Test_snack_ladder_case_1() {
        List<List<Integer>> ladder = new ArrayList<>(List.of(
                List.of(32, 62),
                List.of(42, 68),
                List.of(12, 98)
        ));
        List<List<Integer>> snake = new ArrayList<>(List.of(
                List.of(95, 13),
                List.of(97, 25),
                List.of(93, 37),
                List.of(79, 27),
                List.of(75, 19),
                List.of(49, 47),
                List.of(67, 17)
        ));

        int actual = snakeLadderGame.quickestWayUp(ladder, snake);

        Assertions.assertEquals(3, actual);
    }

    @Test
    void Test_snack_ladder_case_2() {
        List<List<Integer>> ladder = new ArrayList<>(List.of(
                List.of(8, 52),
                List.of(6, 80),
                List.of(26, 42),
                List.of(2, 72)
        ));
        List<List<Integer>> snake = new ArrayList<>(List.of(
                List.of(51, 19),
                List.of(39, 11),
                List.of(37, 29),
                List.of(81, 3),
                List.of(59, 5),
                List.of(79, 23),
                List.of(53, 7),
                List.of(43, 33),
                List.of(77, 21)
        ));

        int actual = snakeLadderGame.quickestWayUp(ladder, snake);

        Assertions.assertEquals(5, actual);
    }
}