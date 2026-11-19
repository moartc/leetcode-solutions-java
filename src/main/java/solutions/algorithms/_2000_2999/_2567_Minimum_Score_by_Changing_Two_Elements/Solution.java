package solutions.algorithms._2000_2999._2567_Minimum_Score_by_Changing_Two_Elements;

import java.util.Arrays;

class Solution {

    /*
    to minimize score I need to minimize the high and the low (or one of them)
    for the array of size 1: do nothing
    of size 2: set both to the same value
    of size 3: set min and max to mid
    all above gives the result = 0
    of size > 3: 3 cases
    - I can change 2 min to the 3rd and 4th
    - I can change 2 max to the 3rd and 4th from the end
    - I can change max to the one before last and min to the one on the right
     */
    public int minimizeSum(int[] nums) {

        if (nums.length <= 3) {
            return 0;
        } else {
            Arrays.sort(nums);

            int lastEl = nums[nums.length - 1];
            int min1 = lastEl - nums[2];

            int min2 = nums[nums.length - 3] - nums[0];
            int min3 = nums[nums.length - 2] - nums[1];

            int minPair1 = Math.min(min1, min2);
            return Math.min(minPair1, min3);
        }
    }
}