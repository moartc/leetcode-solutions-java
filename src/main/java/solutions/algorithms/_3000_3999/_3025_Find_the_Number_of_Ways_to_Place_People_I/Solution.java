package solutions.algorithms._3000_3999._3025_Find_the_Number_of_Ways_to_Place_People_I;

import java.util.Arrays;

class Solution {
    public int numberOfPairs(int[][] points) {

        Arrays.sort(points, (o1, o2) -> {
                    var q = o1[1] - o2[1];
                    if (q == 0) {
                        return o2[0] - o1[0];
                    } else {
                        return q;
                    }
                }
        );

        int ctr = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i; j < points.length; j++) {

                if (i == j) continue;

                int[] f = points[i];
                int[] s = points[j];

                if (f[0] >= s[0] && f[1] <= s[1] && !isSomeoneInside(points, i, j)) {
                    ctr++;
                }
            }
        }
        return ctr;
    }

    private boolean isSomeoneInside(int[][] points, int i, int j) {

        var f = points[i];
        var s = points[j];
        for (int x = i + 1; x < j; x++) {
            var curr = points[x];
            if (curr[0] >= s[0] && curr[1] <= s[1] && curr[0] <= f[0] && curr[1] >= f[1]) {
                return true;
            }
        }
        return false;
    }
}