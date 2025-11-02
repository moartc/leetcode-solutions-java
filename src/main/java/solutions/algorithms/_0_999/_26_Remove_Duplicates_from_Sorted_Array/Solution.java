package solutions.algorithms._0_999._26_Remove_Duplicates_from_Sorted_Array;

class Solution {

    /*
    Start one pointer at 0 and the 2nd one at 1
    check if the second pointer points to a different value than the first
    if it does, place that value at first + 1, then move both pointers
    otherwise, move only the 2nd pointer
     */
    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int idxOfPrev = 0;
        int idxToCheck = 1;
        while (idxToCheck < nums.length) {
            int currentlyChecked = nums[idxToCheck];
            if (currentlyChecked != nums[idxOfPrev]) {
                nums[idxOfPrev + 1] = currentlyChecked;
                idxToCheck++;
                idxOfPrev++;
            } else {
                idxToCheck++;
            }
        }
        return idxOfPrev + 1;
    }
}