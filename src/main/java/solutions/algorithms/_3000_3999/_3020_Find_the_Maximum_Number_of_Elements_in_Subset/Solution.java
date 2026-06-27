package solutions.algorithms._3000_3999._3020_Find_the_Maximum_Number_of_Elements_in_Subset;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    I can build a freq map, iterate through all possible values (max: 10^9)
    starting from each value, I would try to find the next one
     */
    public int maximumLength(int[] nums) {


        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            Integer curr = freqMap.getOrDefault(num, 0);
            freqMap.put(num, curr + 1);
        }

        // spacial handling for '1' since it cannot build anything longer
        int maxFound = 0;

        if (freqMap.containsKey(1)) {
            if (freqMap.get(1) % 2 == 0) {
                maxFound = freqMap.get(1) - 1;
            } else {
                maxFound = freqMap.get(1);
            }
        }

        // this value pow 2 gives me 10 ^ 10 which is outside the max value
        int maxBound = (int) Math.pow(10, 5);
        for (int i = 2; i < maxBound; i++) {
            int current = i;
            int ctr = 0;
            int pow = 2;
            while (freqMap.containsKey(current) && freqMap.get(current) >= 2) {
                ctr++;
                current = (int) Math.pow(i, pow);
                pow *= 2;
            }
            // so I finished because the last value wasn't in the map, or was but only once
            if (freqMap.containsKey(current)) {
                // prev value was once - result is 2*ctr+1
                int res = 2 * ctr + 1;
                maxFound = Math.max(maxFound, res);
            } else {
                // value wasn't there, I have something like 1 2 4 4 2 1
                //  result is 2*ctr - 1
                int res = 2 * ctr - 1;
                maxFound = Math.max(maxFound, res);
            }
        }
        return maxFound;
    }
}