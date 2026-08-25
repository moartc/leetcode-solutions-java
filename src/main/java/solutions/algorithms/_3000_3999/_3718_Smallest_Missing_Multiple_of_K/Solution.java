package solutions.algorithms._3000_3999._3718_Smallest_Missing_Multiple_of_K;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int missingMultiple(int[] nums, int k) {

        Set<Integer> elem = new HashSet<>();
        for (int num : nums) {
            if (num % k == 0) {
                elem.add(num);
            }
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            int toCheck = i * k;
            if (!elem.contains(toCheck)) {
                return toCheck;
            }
        }
        // cannot happen
        return 123;
    }
}