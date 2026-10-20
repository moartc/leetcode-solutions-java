package solutions.algorithms._3000_3999._3886_Sum_of_Sortable_Integers;

class Solution {

    public int sortableIntegers(int[] nums) {

        int answer = 0;
        int n = nums.length;
        for (int k = 1; k <= n; k++) {

            if (n % k == 0) { // can split the array
                if (canSort(k, nums)) {
                    answer += k;
                }
            }
        }
        return answer;
    }

    boolean canSort(int k, int[] nums) {

        // start at every possible index and check nums.length elements
        int prevMax = -1;
        int ctr = nums.length / k;
        int i = 0;
        while (ctr > 0) {
            int[] minMax = sortPart(i, k, nums);
            if (minMax == null) {
                return false;
            } else {
                if (prevMax == -1) {
                    // first array
                    prevMax = minMax[1];
                    ctr--;
                    if (i + k >= nums.length) {
                        i = nums.length % k;
                    } else {
                        i += k;
                    }
                    if (ctr == 0) {
                        return true;
                    }
                } else {
                    if (prevMax > minMax[0]) {
                        // invalid, continue
                        break;
                    } else {
                        // valid, go forward
                        prevMax = minMax[1];
                        if (i + k >= nums.length) {
                            i = nums.length % k;
                        } else {
                            i += k;
                        }
                        ctr--;
                    }
                    if (ctr == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    int[] sortPart(int start, int length, int[] nums) {

        if (length == 1) {
            return new int[]{nums[start], nums[start]};
        }

        ex:
        for (int i = start; i < start + length; i++) {
            int ctr = 0;
            int f = i;
            int s;
            if (f == start + length - 1) {
                s = start;
            } else {
                s = f + 1;
            }
            while (true) {
                if (nums[f] > nums[s]) {
                    // TLE check
                    if (f < i) {
                        return null;
                    } else {
                        i = f;
                        continue ex;
                    }
                }
                ctr++;
                if (ctr == length - 1) {
                    return new int[]{nums[i], nums[s]};
                }
                if (f == start + length - 1) {
                    f = start;
                } else {
                    f++;
                }
                if (s == start + length - 1) {
                    s = start;
                } else {
                    s++;
                }
            }
        }
        return null;
    }
}