package solutions.algorithms._3000_3999._3942_Minimum_Operations_to_Sort_a_Permutation;

class Solution {
    public int minOperations(int[] nums) {

        int n = nums.length;
        // find 0 and check if it's valid

        boolean isLeftSorted = true;
        boolean isRightSorted = true;
        int zeroIdx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroIdx = i;
                int c1 = 1;
                // go left
                int currL = i - 1;
                if (currL == -1) {
                    currL = n - 1;
                }
                int prevL = 0;
                while (c1 < n) {
                    if (nums[currL] < prevL) {
                        isLeftSorted = false;
                        break;
                    } else {
                        prevL = nums[currL];
                        currL--;
                        if (currL == -1) {
                            currL = n - 1;
                        }
                    }
                    c1++;
                }
                // go right

                int c2 = 1;
                int prevR = 0;
                int currR = i + 1;
                if (currR == n) {
                    currR = 0;
                }
                while (c2 < n) {
                    if (nums[currR] < prevR) {
                        isRightSorted = false;
                        break;
                    } else {
                        prevR = nums[currR];
                        currR++;
                        if (currR == n) {
                            currR = 0;
                        }
                    }
                    c2++;
                }
            }
        }
        if (!isLeftSorted && !isRightSorted) {
            return -1;
        }

        // can be sorted
        if (isRightSorted) {
            return Math.min(zeroIdx, 2 + n - zeroIdx);
        }
        return Math.min(zeroIdx + 2, n - zeroIdx);
    }
}