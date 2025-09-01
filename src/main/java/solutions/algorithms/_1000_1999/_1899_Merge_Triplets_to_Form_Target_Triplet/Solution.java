package solutions.algorithms._1000_1999._1899_Merge_Triplets_to_Form_Target_Triplet;

class Solution {


    /*
    It looks like I can create the target triplet if I can find all 3 expected values at all positions
    and the remaining 2 values are not greater than the expected value in the triplet
     */
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        boolean firstFound = false;
        boolean secondFound = false;
        boolean thirdFound = false;

        for (int[] triplet : triplets) {
            int v0 = triplet[0];
            int v1 = triplet[1];
            int v2 = triplet[2];

            if (!firstFound) {
                if (v0 == target[0] && v1 <= target[1] && v2 <= target[2]) {
                    firstFound = true;
                }
            }
            if (!secondFound) {
                if (v1 == target[1] && v0 <= target[0] && v2 <= target[2]) {
                    secondFound = true;
                }
            }
            if (!thirdFound) {
                if (v2 == target[2] && v0 <= target[0] && v1 <= target[1]) {
                    thirdFound = true;
                }
            }
            if (firstFound && secondFound && thirdFound) {
                return true;
            }
        }
        return false;
    }
}