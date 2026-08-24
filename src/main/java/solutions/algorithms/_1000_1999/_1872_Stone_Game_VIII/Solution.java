package solutions.algorithms._1000_1999._1872_Stone_Game_VIII;

class Solution {


    public int stoneGameVIII(int[] stones) {

        int[] prefix = new int[stones.length];
        prefix[0] = stones[0];
        for (int i = 1; i < stones.length; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

//        return play(1, prefix);
        int prev = prefix[prefix.length - 1];
        for (int i = prefix.length - 2; i > 0; i--) {
            prev = Math.max(prefix[i] - prev, prev);
        }
        return prev;
    }


    // initial rec version
    int play(int i, int[] prefix) {

        if (i == prefix.length - 1) {
            return prefix[i];
        } else {
            int prev = play(i + 1, prefix);
            return Math.max(prev, prefix[i] - prev);
        }
    }
}