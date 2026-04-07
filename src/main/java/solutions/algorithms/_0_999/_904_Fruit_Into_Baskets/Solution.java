package solutions.algorithms._0_999._904_Fruit_Into_Baskets;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int bestSize = 0;
        Map<Integer, Integer> freqCounter = new HashMap<>();
        freqCounter.put(fruits[0], 1);
        while (true) {
            if (freqCounter.size() <= 2) {
                // check size here
                int size = right - left + 1;
                bestSize = Math.max(bestSize, size);
                right++;
                if (right < fruits.length) {
                    int val = fruits[right];
                    int currentCounter = freqCounter.getOrDefault(val, 0);
                    currentCounter++;
                    freqCounter.put(val, currentCounter);
                } else {
                    return bestSize;
                }
            } else {
                int leftVal = fruits[left];
                int currentCtr = freqCounter.get(leftVal);
                currentCtr--;
                if (currentCtr == 0) {
                    freqCounter.remove(leftVal);
                } else {
                    freqCounter.put(leftVal, currentCtr);
                }
                left++;
            }
        }
    }

}