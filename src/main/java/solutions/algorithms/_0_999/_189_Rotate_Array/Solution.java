package solutions.algorithms._0_999._189_Rotate_Array;

class Solution {

    /*
    My solution is to repeat the whole process k times
    each time, I move the elements to the right, starting with the element at index 0, which goes to 1,
    up to the element at index n-1 which moves to index 0.
    I only need to keep in memory the value at i+1 which I overwrite with i.

    Also, I don't need to rotate k times, because after nums.length rotations, the state is the same
    I need to do it k mod nums.length times

    Update:
    Ok, that doesn't make sense. I'm getting TLE, so I will move each element to its dedicated place, actually using the algorithm I have.

    And it was impossible, so I had to check the original solution,
    because I wouldn’t have come up with the O(1) memory approach on my own.
     */
    public void rotate(int[] nums, int k) {

        if (nums.length == 1 || nums.length == k) {
            return;
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end) {
        int iter = (end - start + 1) / 2;
        for (int i = 0; i < iter; i++) {
            int temp = nums[i + start];
            nums[i + start] = nums[end - (i)];
            nums[end - i] = temp;
        }
    }
}