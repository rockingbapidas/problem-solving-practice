package array;

public class FindSmallestWindow {
    //Time Complexity O(n), Space Complexity O(1)
    public void findSmallestWindow(String str, String ptr) {
        int len1 = str.length();
        int len2 = ptr.length();

        if (len1 < len2) {
            System.out.println("No such window exists");
            return;
        }

        int[] hash_ptr = new int[256];
        int[] hash_str = new int[256];

        for (int i = 0; i < len2; i++) {
            hash_ptr[ptr.charAt(i)]++;
        }

        int count = 0;
        int start = 0;
        int start_index = -1;
        int min_len = Integer.MAX_VALUE;

        for (int i = 0; i < len1; i++) {
            hash_str[str.charAt(i)]++;

            if (hash_ptr[str.charAt(i)] != 0 && hash_str[str.charAt(i)] <= hash_ptr[str.charAt(i)]) {
                count++;
            }

            if (count == len2) {

                while (hash_str[str.charAt(start)] > hash_ptr[str.charAt(start)] || hash_ptr[str.charAt(start)] == 0) {
                    if (hash_str[str.charAt(start)] > hash_ptr[str.charAt(start)]) {
                        hash_str[str.charAt(start)]--;
                    }
                    start++;
                }

                int len_window = i - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }

            }
        }

        if (start_index == -1) {
            System.out.println("No such window exists");
            return;
        }

        System.out.println("Smallest window : " + str.substring(start_index, start_index + min_len));
    }
}
