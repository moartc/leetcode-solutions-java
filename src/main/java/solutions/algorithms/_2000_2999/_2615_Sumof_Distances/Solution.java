package solutions.algorithms._2000_2999._2615_Sumof_Distances;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    /*
    1, 1, 1, 1, 1
    0  1  2  3  4
    0 = 1,2,3,4 = 1 + 2 + 3 + 4 = 10
    1 = 0,2,3,4 = 1 + 1 + 2 + 3 = 7
    2 = 0,1,3,4 = 2 + 1 + 1 + 2 = 6
    3 = 0,1,2,4 = 3 + 2 + 1 + 1 = 7
    4 = 0,1,2,3 = 4 + 3 + 2 + 1 = 10

    I used these indices to calc prefix
    0 + 1 + 2 + 3 + 4

    prefix: 0, 1, 3, 6, 10
    answer: 10 7  6  7  10

     */
    public long[] distance(int[] nums) {
        Map<Integer, List<Integer>> allIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            List<Integer> list = allIndices.getOrDefault(num, new ArrayList<>());
            list.add(i);
            allIndices.put(num, list);
        }

        Map<Integer, List<Long>> prefixSumPerNum = new HashMap<>();
        for (Map.Entry<Integer, List<Integer>> e : allIndices.entrySet()) {
            Integer key = e.getKey();
            List<Integer> value = e.getValue();
            List<Long> prefix = new ArrayList<>();
            long sum = 0;
            for (Integer i : value) {
                sum += i;
                prefix.add(sum);
            }
            prefixSumPerNum.put(key, prefix);
        }

        long[] answer = new long[nums.length];

        for (Map.Entry<Integer, List<Integer>> entry : allIndices.entrySet()) {
            Integer num = entry.getKey();
            List<Long> prefSum = prefixSumPerNum.get(num);
            for (int i = 0; i < entry.getValue().size(); i++) {
                int index = entry.getValue().get(i);
                long left = (long) i * index - (i > 0 ? prefSum.get(i - 1) : 0);
                long right = prefSum.get(prefSum.size() - 1) - prefSum.get(i) - (long) (prefSum.size() - 1 - i) * index;
                answer[index] = left + right;
            }
        }
        return answer;
    }
}