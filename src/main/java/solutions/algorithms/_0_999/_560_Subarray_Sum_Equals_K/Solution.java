package solutions.algorithms._0_999._560_Subarray_Sum_Equals_K;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    I could start at 0,0
    if the sum is less than k, increase the right pointer
    if the sum is greater and i < j, move the left pointer
    otherwise, move both pointers

    it doesn't work because I have negative numbers

    bruteforce beats 19.32%

    new solution:
    I was pretty close with calculating the sum, but I stored them in an array and tried to use them afterward.
    I need to calculate the prefixes and process them within the same loop.
     */
    public int subarraySum(int[] nums, int k) {


        Map<Integer, Integer> sumToOccurrence = new HashMap<>();
        // the case when I should consider the whole array from the beginning
        sumToOccurrence.put(0, 1);

        int currentSum = 0;
        int answer = 0;
        for (int num : nums) {
            currentSum += num;
            int prefixToFind = currentSum - k;
            Integer foundNumOfPref = sumToOccurrence.get(prefixToFind);
            if (foundNumOfPref != null) {
                answer += foundNumOfPref;
            }
            Integer current = sumToOccurrence.getOrDefault(currentSum, 0);
            sumToOccurrence.put(currentSum, current + 1);
        }
        return answer;
    }
}