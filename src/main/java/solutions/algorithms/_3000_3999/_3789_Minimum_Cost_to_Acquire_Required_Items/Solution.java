package solutions.algorithms._3000_3999._3789_Minimum_Cost_to_Acquire_Required_Items;

class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long commonPart = Math.min(need1, need2);
        long minimumToCommon = Math.min(costBoth * commonPart, ((cost1 * commonPart) + (cost2 * commonPart)));

        if (need1 == need2) { // nothing more to do
            return minimumToCommon;
        } else if (need1 > need2) { // find cost 1
            long toFill = need1 - commonPart;
            long fillingWithSingle = toFill * cost1;
            long fillingWithBoth = toFill * costBoth;
            if (fillingWithSingle < fillingWithBoth) {
                return minimumToCommon + fillingWithSingle;
            } else {
                return minimumToCommon + fillingWithBoth;
            }
        } else { // need2 > need1 -> find cost 2
            long toFill = need2 - commonPart;
            long fillingWithSingle = toFill * cost2;
            long fillingWithBoth = toFill * costBoth;
            if (fillingWithSingle < fillingWithBoth) {
                return minimumToCommon + fillingWithSingle;
            } else {
                return minimumToCommon + fillingWithBoth;
            }
        }
    }
}