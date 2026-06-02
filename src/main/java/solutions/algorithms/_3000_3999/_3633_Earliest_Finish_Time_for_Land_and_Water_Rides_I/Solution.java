package solutions.algorithms._3000_3999._3633_Earliest_Finish_Time_for_Land_and_Water_Rides_I;

class Solution {

    /*
    Possible options
    1.
    wwww
          llll
    2.
    wwww
       llll
    3.
    wwwwlllll
    4.
    llll
          wwwww
    5.
    lllll
       wwwww
    6.
    lllllwwwww
    7.
    llllllllll
        wwww
    8.
    wwwwwwwwww
        lll
    brute force solution - to improve
     */
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int bestFound = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int landStart = landStartTime[i];
            int landEnd = landStart + landDuration[i];

            for (int j = 0; j < waterStartTime.length; j++) {
                int waterStart = waterStartTime[j];
                int waterEnd = waterStart + waterDuration[j];
                int end = -1;
                if (landStart < waterStart) {
                    if (landEnd < waterStart) {
                        end = waterEnd;
                    } else {
                        end = landEnd + waterDuration[j];
                    }
                } else if (waterStart < landStart) {
                    if (landStart > waterEnd) {
                        end = landEnd;
                    } else {
                        end = waterEnd + landDuration[i];
                    }
                } else { // start at the same time
                    end = landEnd + waterDuration[j];
                }

                bestFound = Math.min(bestFound, end);
            }
        }
        return bestFound;
    }
}