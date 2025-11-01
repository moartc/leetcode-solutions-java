package solutions.algorithms._0_999._88_Merge_Sorted_Array;

class Solution {

    /*
    I can set a pointer at the beginning of both arrays and move them while  both are less than m and n respectively.
    I compare the values at the current pointers and take the smaller one.
    if the smaller one is in the second array, I swap the values and move the first pointer
    otherwise, I just move the first pointer

    update:
    I cannot do it, it doesn't work fot that case
    1 2 3 0 0 0     1 2 3

    but I can iterate from the end and just fill the empty space
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            int v1 = nums1[m];
            int v2 = nums2[n];
            if (v1 > v2) {
                nums1[idx] = v1;
                m--;
            } else {
                nums1[idx] = v2;
                n--;
            }
            idx--;
        }
        // there is still something in the first array
        while (n >= 0) {
            nums1[idx] = nums2[n];
            n--;
            idx--;
        }
    }
}