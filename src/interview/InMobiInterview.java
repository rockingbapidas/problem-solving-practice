package interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Given the arrival and departure times of all trains that reach a railway station,
the task is to find the minimum number of platforms required for the railway station so that no train waits.
We are given two arrays that represent the arrival and departure times of trains that stop.

Examples:

Input:
arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input:
arr[] = {9:00, 9:40}
dep[] = {9:10, 12:00}
Output: 1
Explanation: Only one platform is needed.
*/
public class InMobiInterview {
    public int findPlatform(int[] arr, int[] dep) {
        int platform = 1;
        for(int i = 0; i < arr.length; i++) {
            int arrivalTime = arr[i];
            int departureTime = dep[i];

            int j = i + 1;
            while(j < arr.length) {
                int nextArrivalTime = arr[j]; //940
                int nextDepartureTime = dep[j]; // 1200
                if(nextArrivalTime >= arrivalTime && nextDepartureTime <= departureTime) {
                    platform++;
                }
                j++;
            }
        }
        return platform;
    }

    public int findPlatformOptimize(int[] arr, int[] dep) {
        int platform = 0, ans = 0, i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            int arrivalTime = arr[i]; // 1500
            int departureTime = dep[j]; // 1900
            if(arrivalTime <= departureTime) {
                platform++; //1, 1, 2, 3
                i++; //1, 2, 3, 4
            } else {
                platform--; //0, 2, 1, 0
                j++; //1, 2, 3, 4
            }
            ans = Math.max(ans, platform);
        }
        return ans;
    }
}
