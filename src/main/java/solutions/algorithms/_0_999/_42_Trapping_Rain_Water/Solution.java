package solutions.algorithms._0_999._42_Trapping_Rain_Water;

class Solution {
    public int trap(int[] height) {

        if (height.length <= 2) {
            return 0;
        }
        int total = 0;
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        int left = 1;
        int right = height.length - 2;

        while (left <= right) {
            int leftHeight = height[left];
            int rightHeight = height[right];

            if (maxLeft < maxRight) {
                if (leftHeight < maxLeft) {
                    total += maxLeft - leftHeight;
                } else {
                    maxLeft = leftHeight;
                }
                left++;
            } else {
                if (rightHeight < maxLeft && rightHeight < maxRight) {
                    total += maxRight - rightHeight;
                } else {
                    maxRight = rightHeight;
                }
                right--;
            }
        }
        return total;
    }
}