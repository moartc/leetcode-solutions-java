package solutions.algorithms._26_Remove_Duplicates_from_Sorted_Array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 0;
        int checkedIndex = 1;
        while (checkedIndex < nums.length) {
            if (nums[prevIndex] != nums[checkedIndex]) {
                nums[++prevIndex] = nums[checkedIndex];
            }
            checkedIndex++;
        }
        return prevIndex + 1;
    }
}