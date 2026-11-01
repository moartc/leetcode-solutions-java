package solutions.algorithms._0_999._453_Minimum_Moves_to_Equal_Array_Elements;

class Solution {


    /*
    1 2 3 4
    2 3 4 4
    3 4 5 4
    4 5 5 5
    5 6 6 5
    6 7 6 6
    7 7 7 7
     */
    public int minMoves(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
        }

        int tot = 0;
        for (int num : nums) {
            tot += (num - min);
        }
        return tot;
    }
}