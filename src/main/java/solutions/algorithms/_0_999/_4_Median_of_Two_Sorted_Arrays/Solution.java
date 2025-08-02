package solutions.algorithms._0_999._4_Median_of_Two_Sorted_Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        /*
        it's either the middle value or average of 2 values in the middle
        for:
        1 2 3 4 5 6
        7
        final array 1 2 3 4 5 6 7 <- median 4

        another example:
        1 3 5 6 7 8
        2 4 9
         */

        int totalNumberOfElements = nums1.length + nums2.length;
        if (totalNumberOfElements == 1) {
            if (nums1.length == 0) {
                return nums2[0];
            } else {
                return nums1[0];
            }
        }

        int mainCounter = 0;

        // case for only 1 element
        if (totalNumberOfElements % 2 == 1) {
            int elemToReturn = (totalNumberOfElements / 2) + 1;
            int fI = 0;
            int sI = 0;

            while (mainCounter < elemToReturn) {

                int fEl = fI < nums1.length ? nums1[fI] : Integer.MAX_VALUE;
                int sEl = sI < nums2.length ? nums2[sI] : Integer.MAX_VALUE;

                if (fEl < sEl) { // 1st lower
                    fI++;
                    mainCounter++;
                    if (mainCounter == elemToReturn) {
                        return fEl;
                    }
                } else { // 2nd lower
                    sI++;
                    mainCounter++;
                    if (mainCounter == elemToReturn) {
                        return sEl;
                    }
                }
            }

        } else {
            // case for 2 elements
            // determine indices of elements
            int firstElemToReturn = (totalNumberOfElements / 2);
            int secondElemToReturn = firstElemToReturn + 1;

            int firstFound = Integer.MAX_VALUE;
            int secondFound = Integer.MAX_VALUE;

            int fI = 0;
            int sI = 0;

            while (mainCounter < secondFound) { // iterate until the 2nd element is found

                int fEl = fI < nums1.length ? nums1[fI] : Integer.MAX_VALUE;
                int sEl = sI < nums2.length ? nums2[sI] : Integer.MAX_VALUE;

                mainCounter++;
                if (fEl < sEl) { // 1st lower
                    if (mainCounter == firstElemToReturn) {
                        firstFound = fEl;
                    } else if (mainCounter == secondElemToReturn) {
                        // then return average of a previously found element and the current one
                        return (double) (firstFound + fEl) / 2;
                    }
                    fI++;
                } else { // 2nd lower
                    if (mainCounter == firstElemToReturn) {
                        firstFound = sEl;
                    } else if (mainCounter == secondElemToReturn) {
                        // then return average of a previously found element and the current one
                        return (double) (firstFound + sEl) / 2;
                    }
                    sI++;
                }
            }
        }
        return -1;
    }
}