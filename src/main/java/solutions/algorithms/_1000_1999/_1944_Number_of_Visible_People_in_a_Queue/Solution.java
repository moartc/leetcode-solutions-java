package solutions.algorithms._1000_1999._1944_Number_of_Visible_People_in_a_Queue;

import java.util.Stack;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            int ctr = 0;
            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
                stack.pop();
                ctr++;
            }
            if (!stack.isEmpty()) {
                ctr++;
            }
            answer[i] = ctr;
            stack.add(heights[i]);
        }
        return answer;
    }

}