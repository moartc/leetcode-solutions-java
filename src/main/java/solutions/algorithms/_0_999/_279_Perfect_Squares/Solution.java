package solutions.algorithms._0_999._279_Perfect_Squares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /*
    so, for n = 13: I have something like this
     0  0
     1  1
     2  2 = 1+1
     3  3 = 1+1+1
     4  1 = 4
     5  2 = 4+1
     6  3 = 4+1+1
     7  4 = 4+1+1+1
     8  2 = 4+4
     9  1 = 9
    10  2 = 9+1
    11  3 = 9+1+1
    12  3 = 4+4+4
    13  2 = 9+4

    it doesn't really help, but I could iterate from 1 to i, where i*i <= n
    then I go backward through this list. I take one element, subtract it and repeat
    when I repeat I can subtract the same element again. (that's the case with 12 = 3 (4+4+4)
    if the remaining value minus current value <0 I move left to the next element.

    update: no, in this greedy solution for 12 I end up with 9 and then 1,1,1 instead of 4x3
    the solution is similar to the problem 322 Coin Change, but I generate "coins" during the iteration.
    but I will precompute squares
     */
    public int numSquares(int n) {

        List<Integer> perfectSquareList = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            perfectSquareList.add(i * i);
        }
        int[] cache = new int[n + 1];
        Arrays.fill(cache, Integer.MAX_VALUE);

        cache[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (Integer ps : perfectSquareList) {
                if (ps > i) {
                    break;
                }
                cache[i] = Math.min(cache[i], cache[i - ps] + 1);
            }
        }
        return cache[n];
    }
}