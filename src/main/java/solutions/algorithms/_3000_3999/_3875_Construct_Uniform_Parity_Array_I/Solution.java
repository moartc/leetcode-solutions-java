package solutions.algorithms._3000_3999._3875_Construct_Uniform_Parity_Array_I;

class Solution {

    /*
    1. if all are odd then I can take nums1[i]
    2  if all are even then I can take nums1[i]
    3. if they are mixed I can make
      = even from 2 other odds
      - odd always if there is at least 1 add (if not then case 1 or 2)
    It is always possible
     */
    public boolean uniformArray(int[] nums1) {
        return true;
    }
}