package solutions.algorithms._1000_1999._1385_Find_the_Distance_Value_Between_Two_Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int ctr = 0;
        ex:
        for (int a : arr1) {
            for (int b : arr2) {
                int dist = Math.abs(a - b);
                if (dist <= d) {
                    continue ex;
                }
            }
            ctr++;
        }
        return ctr;
    }
}