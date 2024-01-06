package solutions.algorithms._0_999._88_Merge_Sorted_Array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int num1;
        int num2;
        int mainIndex = n + m - 1;
        while (mainIndex >= 0) {
            if (i >= 0 && j >= 0) {
                num1 = nums1[i];
                num2 = nums2[j];
                if (num1 > num2) {
                    nums1[mainIndex] = num1;
                    i--;
                } else {
                    nums1[mainIndex] = num2;
                    j--;
                }
            } else if (i >= 0) {
                return;
            } else if (j >= 0) {
                nums1[mainIndex] = nums2[j];
                j--;
            }
            mainIndex--;
        }
    }
}