package search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class BreadthFirstSearchDistanceTest {
    private BreadthFirstSearchDistance breadthFirstSearchDistance;

    @BeforeEach
    void setUp() {
        breadthFirstSearchDistance = new BreadthFirstSearchDistance();
    }

    @AfterEach
    void tearDown() {
        breadthFirstSearchDistance = null;
    }

    @Test
    void Test_distance_bfs_case_1() {
        int totalNodes = 4;
        int totalEdges = 2;
        List<List<Integer>> edges = new ArrayList<>(List.of(List.of(1, 2), List.of(1, 3)));
        int startNode = 1;

        List<Integer> actual = breadthFirstSearchDistance.bfs(totalNodes, totalEdges, edges, startNode);

        List<Integer> expected = new ArrayList<>(List.of(6, 6, -1));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test_distance_bfs_case_2() {
        int totalNodes = 3;
        int totalEdges = 1;
        List<List<Integer>> edges = new ArrayList<>(List.of(List.of(2, 3)));
        int startNode = 2;

        List<Integer> actual = breadthFirstSearchDistance.bfs(totalNodes, totalEdges, edges, startNode);

        List<Integer> expected = new ArrayList<>(List.of(-1, 6));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test_distance_bfs_case_3() {
        int totalNodes = 5;
        int totalEdges = 3;
        List<List<Integer>> edges = new ArrayList<>(List.of(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(3, 4)
        ));
        int startNode = 1;

        List<Integer> actual = breadthFirstSearchDistance.bfs(totalNodes, totalEdges, edges, startNode);

        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 6, 12, -1));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test_distance_bfs_case_4() {
        int totalNodes = 5;
        int totalEdges = 3;
        List<List<Integer>> edges = new ArrayList<>(List.of(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(3, 4)
        ));
        int startNode = 1;

        List<Integer> actual = breadthFirstSearchDistance.bfs(totalNodes, totalEdges, edges, startNode);

        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 6, 12, -1));

        Assertions.assertEquals(expected, actual);
    }
}