package solutions.algorithms._1000_1999._1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers;

class Solution {

    /*
    just find the highest digit
     */
    public int minPartitions(String n) {

        int maxFound = Integer.MIN_VALUE;
        for (char c : n.toCharArray()) {
            int i = c - '0';
            maxFound = Math.max(i, maxFound);
        }
        return maxFound;
    }
}