package solutions.algorithms._1000_1999._1927_Sum_Game;

class Solution {
    public boolean sumGame(String num) {

        int leftQ = 0;
        int rightQ = 0;
        int leftSum = 0;
        int rightSum = 0;

        char[] cA = num.toCharArray();
        for (int i = 0; i < cA.length; i++) {
            boolean left = i < cA.length / 2;
            if (cA[i] == '?') {
                if (left) {
                    leftQ++;
                } else {
                    rightQ++;
                }
            } else {
                int v = cA[i] - '0';
                if (left) {
                    leftSum += v;
                } else {
                    rightSum += v;
                }
            }
        }
        if (leftQ == 0 && rightQ == 0) {
            return leftSum != rightSum;
        } else if ((leftQ + rightQ) % 2 != 0) {
            return true;
        } else {
            if (leftQ > rightQ) {
                int qOnLeft = leftQ - rightQ;
                return (qOnLeft / 2) * 9 != rightSum - leftSum;
            } else {
                int qOnRight = rightQ - leftQ;
                return (qOnRight / 2) * 9 != leftSum - rightSum;
            }
        }
    }
}
