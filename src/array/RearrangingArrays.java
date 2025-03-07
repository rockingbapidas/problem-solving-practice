package array;

/*
Rearranging array find A array element X and change it to 1 and move those all element to first
and rest of the other element to last.
 */
public class RearrangingArrays {

    public int[] bruteForce(int N, int[] A, int X){
        //first move all X elements to left side
        for ( int i = 0; i < A.length; i++) {
            if(A[i] == X) {
                int j = i - 1;
                while (j >= 0) {
                    if (A[j] != X) {
                        int temp = A[j];
                        A[j] = X;
                        A[j + 1] = temp;
                    }
                    j--;
                }
            }
        }

        //second replace all X element to 1
        for (int i = 0; i < A.length; i++) {
            if(A[i] == X) {
                A[i] = 1;
            }
        }

        return A;
    }

    public int[] optimize(int N, int[] A, int X) {
        return new int[]{};
    }
}
