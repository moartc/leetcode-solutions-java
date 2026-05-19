package solutions.algorithms._2000_2999._2540_Minimum_Common_Value;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int a = 0;
        int b = 0;
        while (a < nums1.length && b < nums2.length) {
            int aV = nums1[a];
            int bV = nums2[b];
            if (aV == bV) {
                return aV;
            } else if (aV < bV) {
                a++;
            } else {
                b++;
            }
        }
        return -1;
    }
}