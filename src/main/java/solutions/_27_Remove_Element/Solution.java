package solutions._27_Remove_Element;

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int index1 = 0;
        int index2 = nums.length - 1;

        while (index1 <= index2) {
            if (nums[index1] != val) {
                index1++;
            } else {
                if (nums[index2] != val) {
                    int temp = nums[index1];
                    nums[index1] = nums[index2];
                    nums[index2] = temp;
                } else {
                    index2--;
                }
            }
        }
        return index1;
    }
}