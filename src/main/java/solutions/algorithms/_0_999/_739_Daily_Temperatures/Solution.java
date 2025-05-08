package solutions.algorithms._0_999._739_Daily_Temperatures;

import java.util.HashMap;
import java.util.Map;

class Solution {

    // todo to improve
    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Map<Integer, Integer> tempToDay = new HashMap<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            int currentTemp = temperatures[i];
            int bestDay = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> ketVal : tempToDay.entrySet()) {
                int temp = ketVal.getKey();
                int day = ketVal.getValue();
                if (temp > currentTemp) {
                    bestDay = Math.min(bestDay, day);
                }
            }
            int toAdd = bestDay == Integer.MAX_VALUE ? 0 : bestDay - i;
            answer[i] = toAdd;
            tempToDay.put(currentTemp, i);
        }
        return answer;
    }
}