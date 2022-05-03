package solutions.algorithms._350_Intersection_of_Two_Arrays_II;

import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int idx1 = 0;
        int idx2 = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int resultCounter = 0;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] < nums2[idx2]) {
                while (idx1 < nums1.length && nums1[idx1] < nums2[idx2]) {
                    idx1++;
                }
            } else if (nums1[idx1] > nums2[idx2]) {
                while (idx2 < nums2.length && nums1[idx1] > nums2[idx2]) {
                    idx2++;
                }
            } else {
                result[resultCounter] = nums1[idx1];
                resultCounter++;
                idx1++;
                idx2++;
            }
        }
        if (resultCounter < result.length) {
            int[] finalResult = new int[resultCounter];
            System.arraycopy(result, 0, finalResult, 0, resultCounter);
            return finalResult;
        } else {
            return result;
        }

    }
}