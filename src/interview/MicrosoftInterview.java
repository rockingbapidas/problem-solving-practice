package interview;

public class MicrosoftInterview {
    /*
    An infrastructure consisting of n cities from l to n, and m bidirectional roads between them are given.
    Roads do not intersect apart from at their start and endpoints (they can pass through underground
    tunnels to avoid collisions).
    For each pair of cities directly connected by a road, let’s define their network rank as the total number of roads
    that are connected to either of the two cities.
    Write a function, given two arrays starts, ends consisting of m integers each and an integer n, where starts[i]
    and ends[i] are cities at the two ends of the i-th road, returns the maximal network rank in the whole infrastructure.
    Example:
    Input:
    starts = [1, 2, 3, 3]
    ends = [2, 3, 1, 4]
    n = 4
    Output:
    4
    Explanation:
    The chosen cities may be 2 and 3, and the four roads connected to them are: (2,1), (2,3), (3,1), (3,4).
     */

    public int maxNetwork(int[] A, int[] B) {
        return 0;
    }

    /*
    After a long time of online classes, you're back in person! Since you're running late to your next class,
    you'll need to get there without being caught in conversation. The objective is to reach your classroom door
    in the bottom right of the map without being spotted by anyone. We are given a two-dimensional board of
    size N * M (N rows and M columns). Each field of the board can be empty (!), may contain an obstacle ('X')
    or may have a person in it. The person might be either you ('A') or a stranger. Each stranger stands still
    and looks straight ahead, in the direction they are facing. Every stranger looks in one of four directions
    (up, down, left or right on the board) and is represented by one of four symbols. A stranger denoted by '',
    to the right; ""', up; or 'v', down. The strangers can see everything in a straight line in the direction
    in which they are facing, as far as the first obstacle ('X' or any other stranger) or the edge of the board.
    The strangers will not turn and will not spot you if you are not in their direct line of sight.
    You can move from the current field to any other empty field with a shared edge (horizontally and vertically,
    but not diagonally). You cannot move onto fields containing obstacles or other people.
    Write a function:
    bool solution (vector &B); that, given an array B consisting of N strings denoting rows of the array,
    returns true if it is possible for you to sneak from your current location to your classroom door in
    the bottom-right cell of the board undetected, and false otherwise. Examples: .....", your function should
    return false. All available paths lead 1. Given B = ["x.... .X.' through a field observed by a stranger. х > V х > х A
    Write an efficient algorithm for the following assumptions: • Nis an integer within the range [1..500); •
    all strings in B are of the same length M from range (1.500); . there is exactly one of you on the board; •
    there is no stranger or wall on B[N-1][M-1); • every string in B consists only of the following
    characters '', 'X', '', 'v', 'and/or 'A'.
     */
}
