package solutions.algorithms._1000_1999._1758_Minimum_Changes_To_Make_Alternating_Binary_String;

class Solution {

    /* iterate twice, the first time expect the first char '1' and then '0'.
    if the char is different from expected, increase a counter
    I can actually check both cases in 1 iteration only.
    */
    public int minOperations(String s) {

        int expected1 = '0';
        int coutner1 = 0;
        int expected2 = '1';
        int coutner2 = 0;
        for (char c : s.toCharArray()) {
            if (c != expected1) {
                coutner1++;
            }
            if (c != expected2) {
                coutner2++;
            }
            if (expected1 == '0') {
                expected1 = '1';
                expected2 = '0';
            } else {
                expected1 = '0';
                expected2 = '1';
            }
        }
        return Math.min(coutner1, coutner2);
    }
}