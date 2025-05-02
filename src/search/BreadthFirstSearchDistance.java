package search;

import java.util.*;

/*
Consider an undirected graph where each edge weighs 6 units. Each of the nodes is labeled consecutively from 1 to n.
You will be given a number of queries. For each query, you will be given a list of edges describing an undirected graph.
After you create a representation of the graph, you must determine and report the shortest distance to each of the other
nodes from a given starting position using the breadth-first search algorithm (BFS). Return an array of distances from
the start node in node number order. If a node is unreachable, return  for that node.

Function Description
Complete the bfs function in the editor below. If a node is unreachable, its distance is .
bfs has the following parameter(s):

int n: the number of nodes
int m: the number of edges
int edges[m][2]: start and end nodes for edges
int s: the node to start traversals from
Returns
int[n-1]: the distances to nodes in increasing node number order, not including the start node (-1 if a node is not reachable)

Input Format

The first line contains an integer , the number of queries. Each of the following  sets of lines has the following format:

The first line contains two space-separated integers  and , the number of nodes and edges in the graph.
Each line  of the  subsequent lines contains two space-separated integers,  and , that describe an edge between nodes  and .
The last line contains a single integer, , the node number to start from.
Constraints

Sample Input

2
4 2
1 2
1 3
1
3 1
2 3
2
Sample Output

6 6 -1
-1 6
 */
public class BreadthFirstSearchDistance {
    public List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        Map<Integer, Set<Integer>> mNodeToNeigh = new HashMap<>();
        for (List<Integer> edge : edges) {
            int x = edge.get(0);
            int y = edge.get(1);
            Set<Integer> neighX;
            if (mNodeToNeigh.get(x) == null) {
                neighX = new HashSet<>();
            } else {
                neighX = mNodeToNeigh.get(x);
            }
            neighX.add(y);
            mNodeToNeigh.put(x, neighX);

            Set<Integer> neighY;
            if (mNodeToNeigh.get(y) == null) {
                neighY = new HashSet<>();
            } else {
                neighY = mNodeToNeigh.get(y);
            }
            neighY.add(x);
            mNodeToNeigh.put(y, neighY);
        }
        return compute(n, m, mNodeToNeigh, s);
    }

    private List<Integer> compute(int mN, int mM, Map<Integer, Set<Integer>> mNodeToNeigh, Integer mS) {
        List<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> visitedMinDis = new HashMap<>();
        visitedMinDis.put(mS, 0);
        queue.add(mS);

        while (!queue.isEmpty()) {
            Integer element = queue.remove();

            if (mNodeToNeigh.get(element) != null) {
                for (Integer neigh : mNodeToNeigh.get(element)) {
                    int distance = visitedMinDis.get(element) + 1;
                    if (!visitedMinDis.containsKey(neigh)) {
                        queue.add(neigh);
                        visitedMinDis.put(neigh, distance);
                    } else if (visitedMinDis.get(neigh) > distance) {
                        visitedMinDis.put(neigh, distance);
                    }
                }
            }
        }

        for (Integer i = 1; i <= mN; i++) {
            if (!i.equals(mS)) {
                Integer dis = visitedMinDis.get(i);
                if (dis == null) {
                    result.add(-1);
                } else {
                    result.add(dis * 6);
                }
            }
        }
        return result;
    }
}
