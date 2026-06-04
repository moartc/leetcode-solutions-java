package solutions.algorithms._3000_3999._3635_Earliest_Finish_Time_for_Land_and_Water_Rides_II;

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {


        int answer = Integer.MAX_VALUE;

        // first land then water
        // find the smallest end for land
        int minEndLand = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minEndLand = Math.min(minEndLand, landStartTime[i] + landDuration[i]);
        }
        // find the smallest end for water that starts >= end land
        for (int i = 0; i < waterStartTime.length; i++) {
            answer = Math.min(answer, Math.max(waterStartTime[i], minEndLand) + waterDuration[i]);
        }

        // first water then land
        // find the smallest end for water
        int minEndWater = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            minEndWater = Math.min(minEndWater, waterStartTime[i] + waterDuration[i]);
        }
        // find the smallest end for land that starts >= end water
        for (int i = 0; i < landStartTime.length; i++) {
            answer = Math.min(answer, Math.max(landStartTime[i], minEndWater) + landDuration[i]);
        }
        return answer;
    }
}