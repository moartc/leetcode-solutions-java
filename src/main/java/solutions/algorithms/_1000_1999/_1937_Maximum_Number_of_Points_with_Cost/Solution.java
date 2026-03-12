package solutions.algorithms._1000_1999._1937_Maximum_Number_of_Points_with_Cost;

class Solution {

    /*
    basically dfs, can cache here on row and col
    I got TLE, trying something O(n*m)
    hint: I need to check left & right
    4,1,0,4,0
    1,0,4,0,5
    1,3,0,4,1
    4,4,0,4,0

    4 3 2 4 3 | 4 2 3 4 0
    5 4 7 6 8
     */

    public long maxPoints(int[][] points) {

        long[] left = new long[points[0].length];
        long[] right = new long[points[0].length];
        long[] current = new long[points[0].length];
        long[] prev = new long[points[0].length];

        for (int i = 0; i < points[0].length; i++) {
            prev[i] = points[0][i];
        }

        for (int y = 1; y < points.length; y++) {
            // set left
            left[0] = prev[0];
            for (int x = 1; x < points[0].length; x++) {
                left[x] = Math.max(left[x - 1] - 1, prev[x]);
            }
            // set right
            right[points[0].length - 1] = prev[points[0].length - 1];
            for (int x = points[0].length - 2; x >= 0; x--) {
                right[x] = Math.max(right[x + 1] - 1, prev[x]);
            }
            // set current
            for (int i = 0; i < current.length; i++) {
                current[i] = points[y][i] + Math.max(left[i], right[i]);
            }
            prev = current;
        }

        long max = 0;
        for (long l : prev) {
            max = Math.max(l, max);
        }
        return max;
    }

}