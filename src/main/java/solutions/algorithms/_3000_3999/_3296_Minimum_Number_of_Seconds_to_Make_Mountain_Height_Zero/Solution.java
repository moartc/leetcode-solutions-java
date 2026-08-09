package solutions.algorithms._3000_3999._3296_Minimum_Number_of_Seconds_to_Make_Mountain_Height_Zero;

class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {


        long min = 1;
        long max = 10000000000000000L;
        long bestFound = -1;
        while (min <= max) {
            long mid = (max + min) / 2;
            if (canReduceToZeroInMinutes(mid, mountainHeight, workerTimes)) {
                max = mid - 1;
                bestFound = mid;
            } else {
                min = mid + 1;
            }
        }
        return bestFound;
    }


    /*
    probably I could replace it with a formula instead of iteration, but it passed
     */
    boolean canReduceToZeroInMinutes(long min, int mH, int[] workerTimes) {
        long totalReduce = 0;
        for (int singleWorker : workerTimes) {

            long workerCtr = 1;
            long currentTime = 0;
            while (workerCtr <= mH && min >= currentTime + singleWorker * workerCtr) {
                currentTime += singleWorker * workerCtr;
                workerCtr++;
            }
            long realTime = workerCtr - 1;
            totalReduce += realTime;
            if (totalReduce >= mH) {
                return true;
            }
        }
        if (totalReduce >= mH) {
            return true;
        } else {
            return false;
        }
    }
}