package solutions.algorithms._0_999._169_Majority_Element;

class Solution {

    /*
    I can do it easily with a frequency map,
    ---
    I googled Boyer-Moore algorithm which I implemented below
     */
    public int majorityElement(int[] nums) {

        int val = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int v = nums[i];
            if (v == val) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    // reassign val
                    val = v;
                    count = 1;
                }
            }
        }
        return val;


        /*
        // Initial implementation
        Map<Integer, Integer> freqMap = new HashMap<>();

        int maxFreq = 0;
        int maxVal = 0;
        for (int num : nums) {
            int currFreq = freqMap.getOrDefault(num, 0);
            freqMap.put(num , currFreq + 1);
            // check it here so I don't need to iterate secund time
            if(currFreq + 1 > maxFreq) {
                maxFreq  = currFreq + 1;
                maxVal = num;
            }
        }
        return maxVal;
         */
    }
}