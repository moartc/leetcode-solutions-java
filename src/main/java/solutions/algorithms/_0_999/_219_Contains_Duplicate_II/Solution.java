package solutions.algorithms._0_999._219_Contains_Duplicate_II;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /*
    ok, so I have 2 indices, i and j and the abs distance between them should be <=k
    that means I have a window of length 2k.
    I can start with an empty set, add the element at index 0, then 1, then 2, expanding it up to size 2k.
    Each time I add an element, I check if it's already in the set - if so, return true.
    When the window reaches its max size, I remove the leftmost element (which I can access by index)
    and add the next one on the right, again checking if it's already in the set.
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k == 0) {
            // I cannot find 2 distinct indices where the distance is equal to 0
            return false;
        }
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < nums.length) {
            if (set.size() >= k + 1) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
            i++;
        }
        return false;
    }
}