package solutions.algorithms._1000_1999._1752_Check_if_Array_Is_Sorted_and_Rotated;

class Solution {

    /*
    try to find a rotation index (if there is only one - otherwise return false early)
    if the rotation index hasn't been found - return true
    otherwise, perform the actual validation starting from the found index
     */
    public boolean check(int[] nums) {

        if (nums.length == 1) {
            return true;
        }

        int shifAt = -1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (prev > curr) {
                if (shifAt != -1) {
                    return false;
                } else {
                    shifAt = i;
                }
            }
            prev = curr;
        }
        if (shifAt == -1) {
            return true;
        }
        prev = nums[shifAt];
        int i = (shifAt + 1) % nums.length;

        while (i != shifAt) {
            int curr = nums[i];
            if (prev > curr) {
                return false;
            }
            prev = curr;
            i = ((i + 1) % nums.length);
        }
        return true;
    }
}