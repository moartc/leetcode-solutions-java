package solutions.algorithms._0_999._189_Rotate_Array;

class Solution {
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        k = k % length;
        //reverse last part to move
        reverse(nums, length - k, length - 1);

        //reverse first part
        reverse(nums, 0, length - k - 1);

        // reverse all
        reverse(nums, 0, length - 1);
    }

    private void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private void reverse(int[] arr, int idx1, int idx2) {
        while (idx1 < idx2) {
            swap(arr, idx1, idx2);
            idx1++;
            idx2--;
        }
    }
}