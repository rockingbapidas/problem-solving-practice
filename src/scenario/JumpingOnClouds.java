package scenario;

public class JumpingOnClouds {
    public int jump(int n, int[] c) {
        int size = c.length;
        int count = -1;
        for (int i = 0; i < size; i++, count++) {
            if (i < size - 2 && c[i + 2] == 0)
                i++;
        }
        return count;
    }
}
