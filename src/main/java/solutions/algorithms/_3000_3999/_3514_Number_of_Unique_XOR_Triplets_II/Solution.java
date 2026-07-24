package solutions.algorithms._3000_3999._3514_Number_of_Unique_XOR_Triplets_II;

class Solution {
    /*
    max val 1500 in 2048
     */
    public int uniqueXorTriplets(int[] nums) {

        boolean[] uniqueVals = new boolean[1501];
        for (int num : nums) {
            uniqueVals[num] = true;
        }
        boolean[] abXor = new boolean[2049];

        for (int i1 = 0; i1 < uniqueVals.length; i1++) {
            if (!uniqueVals[i1]) {
                continue;
            }

            for (int i2 = i1; i2 < uniqueVals.length; i2++) {
                if (!uniqueVals[i2]) {
                    continue;
                }
                int r = i1 ^ i2;
                abXor[r] = true;
            }
        }

        boolean[] abcXor = new boolean[2049];

        for (int i = 0; i < abXor.length; i++) {
            if (!abXor[i]) {
                continue;
            }
            for (int v3 = 0; v3 < uniqueVals.length; v3++) {
                if (!uniqueVals[v3]) {
                    continue;
                }
                int r = i ^ v3;
                abcXor[r] = true;
            }
        }
        int ctr = 0;
        for (boolean b : abcXor) {
            if (b) {
                ctr++;
            }
        }
        return ctr;
    }
}