package solutions.algorithms._3000_3999._3723_Maximize_Sum_of_Squares_of_Digits;

class Solution {
    /*
    it's better to max 1 number than split it in
    max sum is always 9 x num
     */
    public String maxSumOfSquares(int num, int sum) {

        if (sum > num * 9) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (sum > 9) {
                sb.append("9");
                sum -= 9;
            } else {
                sb.append(sum);
                sum = 0;
            }
            num--;
        }
        return sb.toString();
    }
}