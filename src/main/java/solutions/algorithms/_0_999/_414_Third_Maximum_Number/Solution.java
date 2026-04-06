package solutions.algorithms._0_999._414_Third_Maximum_Number;

import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();

        for (int num : nums) {
            ts.add(num);
        }
        if (ts.size() < 3) {
            return ts.last();
        } else {
            ts.pollLast();
            ts.pollLast();
            return ts.pollLast();
        }
    }

}