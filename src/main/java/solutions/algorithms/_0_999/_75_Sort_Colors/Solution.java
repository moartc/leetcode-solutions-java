package solutions.algorithms._0_999._75_Sort_Colors;

class Solution {

    /*
    I could iterate once to count 0s, 1s, and 2s,
    then iterate a second time to set them.

    update:
    trying to do it with a one-pass algorithm
    apparently it's Dutch national flag problem / algorithm
     */

    public void sortColors(int[] nums) {

        int next0 = 0;
        int next2 = nums.length - 1;
        int current = 0;
        while (current <= next2) {
            if (nums[current] == 0) {
                swap(current, next0, nums);
                current++;
                next0++;
            } else if (nums[current] == 1) {
                current++;
            } else {
                swap(current, next2, nums);
                next2--;
            }
        }
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors1(int[] nums) {

        int ctr0 = 0;
        int ctr1 = 0;
        for (int num : nums) {
            if (num == 0) {
                ctr0++;
            } else if (num == 1) {
                ctr1++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (ctr0 > 0) {
                nums[i] = 0;
                ctr0--;
            } else if (ctr1 > 0) {
                nums[i] = 1;
                ctr1--;
            } else {
                nums[i] = 2;
            }
        }
    }

}
