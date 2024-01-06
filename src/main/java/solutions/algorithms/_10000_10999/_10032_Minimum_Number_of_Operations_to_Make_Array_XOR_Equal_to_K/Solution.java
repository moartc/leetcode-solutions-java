package solutions.algorithms._10000_10999._10032_Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K;

class Solution {
    public int minOperations(int[] nums, int k) {

        var xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        char[] xorArr = Integer.toBinaryString(xor).toCharArray();
        char[] kArr = Integer.toBinaryString(k).toCharArray();

        char[] longer;
        char[] shorter;
        if (xorArr.length > kArr.length) {
            longer = xorArr;
            shorter = kArr;
        } else {
            longer = kArr;
            shorter = xorArr;
        }

        int ctr = 0;

        for (int i = 0; i < longer.length - shorter.length; i++) {
            if (longer[i] == '1') {
                ctr++;
            }
        }

        for (int i = 0; i < shorter.length; i++) {
            if (xorArr[xorArr.length - i - 1] != kArr[kArr.length - i - 1]) {
                ctr++;
            }
        }
        return ctr;
    }
}