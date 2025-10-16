package solutions.algorithms._0_999._27_Remove_Element;

class Solution {

    /*
    I can just iterate through the array and always replace it with the last non val element.
    I can set the first main pointer at the beginning and the second one at the end.
    Before swapping elements, I have to check the last element, and if it's equal to val, move the pointer forward (toward
     the beginning of the array).

     actually the same solution as I had before
     */
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] != val) {
                i++;
            } else {
                if (nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                } else {
                    j--;
                }
            }
        }
        return i;
    }
}