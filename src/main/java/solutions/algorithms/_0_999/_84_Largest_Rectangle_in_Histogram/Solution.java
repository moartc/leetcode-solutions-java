package solutions.algorithms._0_999._84_Largest_Rectangle_in_Histogram;

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int max = -1;

        for (int i = 0; i < heights.length; i++) {
            int currentH = heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] > currentH) {
                int prevIdx = stack.pop();
                int prevVal = heights[prevIdx];

                int area;
                if (stack.isEmpty()) {
                    int rightBound = i - prevIdx;
                    int leftBound = prevIdx;
                    int size = rightBound + leftBound;
                    area = size * prevVal;
                } else {
                    int rightBound = i - prevIdx;
                    int leftBound = prevIdx - stack.peek() - 1;
                    int size = rightBound + leftBound;
                    area = size * prevVal;
                }
                max = Math.max(area, max);
            }
            // add the current one
            stack.push(i);
        }
        int lastIdx = heights.length;
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            int val = heights[idx];
            int area = stack.isEmpty() ? heights.length * val : (lastIdx - stack.peek() - 1) * val;
            max = Math.max(area, max);
        }
        return max;
    }
}