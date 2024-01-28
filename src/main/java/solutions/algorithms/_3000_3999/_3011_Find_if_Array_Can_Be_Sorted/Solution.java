package solutions.algorithms._3000_3999._3011_Find_if_Array_Can_Be_Sorted;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    public boolean canSortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            char[] charArray = Integer.toBinaryString(num).toCharArray();
            var ctr = 0;
            for (char c : charArray) {
                if (c == '1') {
                    ctr++;
                }
            }
            map.put(num, ctr);
        }

        return bubbleSort(nums, nums.length, map);
    }

    private boolean bubbleSort(int[] arr, int n, Map<Integer, Integer> map) {
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int i1 = arr[j];
                    int i2 = arr[j + 1];
                    if (!Objects.equals(map.get(i1), map.get(i2))) {
                        return false;
                    }
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return true;
    }
}