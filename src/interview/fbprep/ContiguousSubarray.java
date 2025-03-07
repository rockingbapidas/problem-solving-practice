package interview.fbprep;

public class ContiguousSubarray {

   public int[] countSubarrays(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int left = i - 1;
            int right = i + 1;

            int count = 1;

            while (left >= 0 && arr[left] < arr[i]) {
                count++;
                left--;
            }

            while (right < arr.length && arr[right] < arr[i]) {
                count++;
                right++;
            }

            result[i] = count;
        }

        return result;
    }
}
