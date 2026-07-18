package solutions.algorithms._1000_1999._1979_Greatest_Common_Divisor_of_Array;

class Solution {
    public int findGCD(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }
        return gcd(smallest, largest);
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