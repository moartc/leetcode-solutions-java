package solutions.algorithms._0_999._75_Sort_Colors;

class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
    }

    void quicksort(int[] nums, int leftIdx, int rightIdx) {
        if (leftIdx < rightIdx) {
            int pivot = partition(nums, leftIdx, rightIdx);
            quicksort(nums, leftIdx, pivot - 1);
            quicksort(nums, pivot + 1, rightIdx);
        }
    }

    int partition(int[] nums, int leftIdx, int rightIdx) {

        int pivot = nums[rightIdx];
        int idx = leftIdx - 1;
        for (int i = leftIdx; i < rightIdx; i++) {
            if (nums[i] < pivot) {
                idx++;
                swap(nums, idx, i);
            }
        }
        swap(nums, idx + 1, rightIdx);
        return idx + 1;
    }

    void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
