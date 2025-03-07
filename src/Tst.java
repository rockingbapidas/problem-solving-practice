import java.util.Arrays;

public class Tst {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left ] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else if (arr[left] == 1)  {
                while (right > left && arr[right] != 0) {
                    right--;
                }
                if (arr[right] == 0) {
                    swap(arr, left, right);
                }
            } else if (arr[right] == 0){
                while (left < right && arr[left] != 1) {
                    left++;
                }
                if (arr[left] == 1) {
                    swap(arr, left, right);
                }
            } else {
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
