package solutions.algorithms._3000_3999._3411_Maximum_Subarray_With_Equal_Products;

class Solution {
    public int maxLength(int[] nums) {

        int bestFound = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            int size;
            // first 2, and the rest in the loop
            int gcd = gcd(nums[i], nums[i + 1]);
            int lcm = lcm(nums[i], nums[i + 1]);
            int prod = nums[i] * nums[i + 1];
            if (prod == lcm * gcd) {
                size = 2;
                bestFound = Math.max(bestFound, 2);
            } else {
                continue;
            }
            for (int j = i + 2; j < nums.length; j++) {
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);
                prod *= nums[j];
                if (prod == lcm * gcd) {
                    size++;
                } else {
                    break;
                }
                bestFound = Math.max(bestFound, size);
            }
        }
        return bestFound;
    }

    int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}