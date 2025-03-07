package scenario;

/**
 * It is New Year's Day and people are in line for the Wonderland roller coaster ride.
 * Each person wears a sticker indicating their initial position in the queue from  to .
 * Any person can bribe the person directly in front of them to swap positions,
 * but they still wear their original sticker. One person can bribe at most two others.
 * Determine the minimum number of bribes that took place to get to a given queue order.
 * Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
 */
public class MinimumBribes {
    private void minimum(int[] q) {
        int count = 0;
        // always keep track of min three values observed
        // Compare currently seeing value with this three values.
        int midOfThree = Integer.MAX_VALUE;
        int maxOfThree = Integer.MAX_VALUE;
        int minOfThree = Integer.MAX_VALUE;

        // iterating from left to right
        for (int i = q.length - 1; i >= 0; i--) {
            // person has no way to move more than two positions -> wrong
            if ((q[i] - i) > 3) {
                System.out.println("Too chaotic");
                return;
            } else {
                // means current value has passed at least 3 values -> wrong
                if (q[i] > maxOfThree) {
                    System.out.println("Too chaotic");
                    return;
                } else if (q[i] > midOfThree) { // means -> current value has bribed 2 ppl
                    count = count + 2;
                } else if (q[i] > minOfThree) { // means-> current value has bribed 1 person.
                    count = count + 1;
                }

                // Now adjust minThree values comparing, taking the current vlaue to account
                if (q[i] < minOfThree) {
                    maxOfThree = midOfThree;
                    midOfThree = minOfThree;
                    minOfThree = q[i];
                } else if (q[i] < midOfThree) {
                    maxOfThree = midOfThree;
                    midOfThree = q[i];
                } else if (q[i] < maxOfThree) {
                    maxOfThree = q[i];
                }
            }
        }
        System.out.println(count);
    }
}
