package solutions.algorithms._0_999._67_Add_Binary;

class Solution {

    /*
    It's just a backward iteration
    when I have 00 I can add 0 to the result,
    if I have 01 or 10 I can add 1
    if I have 11 I add 0 and carry 1 as a remainder
    after each operation I check if there is any remainder, if so, I add it as well to the 'final step value'
     */
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int remainder = 0;
        int aL = a.length();
        int bL = b.length();
        int maxIdx = Math.max(aL, bL);
        for (int i = 0; i < maxIdx; i++) {
            int f = 0;
            int s = 0;
            if (i < aL) {
                f = a.charAt(aL - 1 - i) - '0';
            }
            if (i < bL) {
                s = b.charAt(bL -1 - i)- '0';
            }
            // I can sum up all the values and
            int stepRes = f + s + remainder;
            sb.append(stepRes % 2);
            remainder = stepRes / 2;
        }
        if(remainder == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}