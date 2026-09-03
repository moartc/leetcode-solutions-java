package solutions.algorithms._3000_3999._3876_Construct_Uniform_Parity_Array_II;

class Solution {

    /*
    1. if all are odd then I can take nums1[i]
    2  if all are even then I can take nums1[i]
    3. if they are mixed I can make
      - even from 2 other odds -> I could remember the lowest odd
      - odd always if there is at least 1 add -> still it makes sense to remember it

    Then -> 1 iteration, check if all are even or odd plus remember the smallest odd
    Then I can iterate twice and try to make all odd or even
    for odd -> from even subtract the smallest odd (or keep if it is odd)
    for even -> from odd subtract the smallest odd (or keep if it is even)
     */
    public boolean uniformArray(int[] nums1) {

        boolean allOdd = true;
        boolean allEven = true;
        int smallestOdd = Integer.MAX_VALUE;
        for (int i : nums1) {
            if (i % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
                smallestOdd = Math.min(smallestOdd, i);
            }
        }
        if (allEven || allOdd) {
            return true;
        }

        boolean canMakeAllEven = true;
        boolean canMakeAllOdd = true;
        for (int i : nums1) {
            // try even
            if (i % 2 == 0) { // even -> try odd
                int r = i - smallestOdd;
                if (r < 1) {
                    canMakeAllOdd = false;
                }

            } else { // odd -> try even
                int r = i - smallestOdd;
                if (r < 1) {
                    canMakeAllEven = false;
                }
            }
            if (!(canMakeAllEven || canMakeAllOdd)) {
                return false;
            }
        }

        return true;
    }
}