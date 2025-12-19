package solutions.algorithms._1000_1999._1863_Sum_of_All_Subset_XOR_Totals;

class Solution {


    /*
    I could start from the first element (index 0)
    make 2 branches where I either include it or skip
    then call the method for the next element and repeat/
    so, the second call for both branches accesses element at index 1
    I can either include it or skip, giving 4 different combinations at this point.
    When I reach the last element I increase the global sum by the final value

    update: I started with a global counter, but then replace it by value returned from the calc method.
     */
    public int subsetXORSum(int[] nums) {

        return calc(0, nums, 0);
    }

    private int calc(int idx, int[] nums, int currentRes) {
        if (idx == nums.length) {
            return currentRes;
        } else {
            int newRes = currentRes ^ nums[idx];
            int totalVal = calc(idx + 1, nums, newRes);
            // and here skip it
            totalVal += calc(idx + 1, nums, currentRes);
            return totalVal;
        }
    }
}