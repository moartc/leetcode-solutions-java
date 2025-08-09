package solutions.algorithms._0_999._239_Sliding_Window_Maximum;

import java.util.Deque;
import java.util.LinkedList;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        /*
        Initial idea:
        After initializing the window, for each slide:
        Remove the element leaving the window; if it’s the highest (front of the queue), remove it from the deque.

        When adding a new element on the right:
        If it’s greater than the first element (or the deque is empty), clear the deque and add it at the front.
        Otherwise, add it at the end, but first remove from the back all smaller elements before adding it.

        Improved:
        Always remove from the back all smaller elements before adding the new one
        no need to check if the last element is greater.
         */

        Deque<Integer> deque = new LinkedList<>();

        // output array size = nums.length - k + 1
        int outputSize = nums.length - k + 1;
        int[] answer = new int[outputSize];

        // size is at least 1, so I can add the first element to deque
        deque.addFirst(nums[0]);
        // initialize window, starting from the 2nd element to the end of this windows
        for (int i = 1; i < k; i++) {
            int currentToCheck = nums[i];
            // delete all lower from the end
            while (!deque.isEmpty() && deque.getLast() < currentToCheck) {
                deque.pollLast();
            }
            deque.addLast(currentToCheck);

        }
        // add first element
        answer[0] = deque.getFirst();
        int answerArrayIndex = 1;

        // now move window
        for (int i = k; i < nums.length; i++) {
            int indexOutside = i - k;
            int outsideElement = nums[indexOutside];
            int nextRight = nums[i];

            if (outsideElement == deque.getFirst()) {
                // if the highest is outside the window, delete it
                deque.pollFirst();
            }

            // delete all lower from the end, and add it in the righ place
            while (!deque.isEmpty() && deque.getLast() < nextRight) {
                deque.pollLast();
            }
            deque.addLast(nextRight);
            // add next element at the end
            answer[answerArrayIndex] = deque.getFirst();
            answerArrayIndex++;
        }
        return answer;
    }
}


