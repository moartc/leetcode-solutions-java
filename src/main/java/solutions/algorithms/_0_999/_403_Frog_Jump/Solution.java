package solutions.algorithms._0_999._403_Frog_Jump;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

    /*
    it looks like a 2d DP problem, but I don't see the solution (yet)
    I will try the simplest dfs first, it will probably TLE
    update: it was TLE and even caching didn't help

    2d arr
    from/to 0  1  3  5  6  8  12 17
          0 x  t
          1 x  x  t   (1x3, diff 2 I check if 1 was access for 0,1,2)
          3 x  x  x  t  t
          5 x  x  x  x  1
          6 x  x  x  x  x  t
          8 x  x  x  x  x  x
         12 x  x  x  x  x  x  x
         17 x  x  x  x  x  x  x  x
    the problem is that I can have multiple jump lengths on the same stone,
    and I don't know how to store them

    I could check if I can reach 12 by checking if 8 was reached before with a jump length in range 3-5.
    I can scan these indices. This actually looks like a decent option and shouldn't be too slow
    I could probably backtrack it later as well.

    basically, I would iterate through the stones using 2 loops
    for each stone I mark which ones are accessible
    for the next stone I check the array, for example for the combination 8 x 12
    the diff is 4 (range 3-5), so I check if 8 was reached from 5,4 or 3
    initial solution beats ~5%, with some optimisation (tracking the jump lengths with which the stone
    can be reached) it's 47.97% now
     */
    public boolean canCross(int[] stones) {

        if (stones.length == 2) {
            return stones[1] == 1;
        }
        if (stones[1] != 1) {
            return false;
        }

        Map<Integer, Integer> stoneToIdx = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            int stone = stones[i];
            stoneToIdx.put(stone, i);
        }

        Set<Integer>[] dpSet = new HashSet[stones.length];
        for (int i = 0; i < stones.length; i++) {
            dpSet[i] = new HashSet<>();
        }
        dpSet[1].add(1); // 1 was reach with a jump of size 1

        for (int from = 1; from < stones.length; from++) {
            int fromStone = stones[from];
            for (int jump : dpSet[from]) {
                for (int jumpLength = jump - 1; jumpLength <= jump + 1; jumpLength++) {
                    if (jumpLength <= 0) {
                        continue;
                    }
                    if (stoneToIdx.containsKey(fromStone + jumpLength)) {
                        int stoneIdx = stoneToIdx.get(fromStone + jumpLength);
                        int toStone = stones[stoneIdx];
                        int difference = toStone - fromStone;
                        dpSet[stoneIdx].add(difference);
                        if (stoneIdx == stones.length - 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


}