package solutions.algorithms._0_999._15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int[] sortedArray = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> result = new ArrayList<>();

        int i = 0;

        while (i < sortedArray.length) {
            int valI = sortedArray[i];
            if (valI > 0) {
                break;
            }
            int j = i + 1;
            int k = sortedArray.length - 1;
            while (j < k) {
                int sum = valI + sortedArray[j] + sortedArray[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else { // sum == 0
                    List<Integer> listToAdd = new ArrayList<>();
                    listToAdd.add(valI);
                    listToAdd.add(sortedArray[j]);
                    listToAdd.add(sortedArray[k]);
                    result.add(listToAdd);

                    do {
                        j++;
                    } while (j < k && sortedArray[j - 1] == sortedArray[j]);
                }
            }
            do {
                i++;
            } while (i < sortedArray.length && sortedArray[i] == sortedArray[i - 1]);
        }
        List<List<Integer>> finalResult = new ArrayList<>();
        for (List<Integer> integers : result) {
            finalResult.add(integers.stream().toList());
        }
        return finalResult;
    }
}