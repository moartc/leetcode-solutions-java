package solutions.algorithms._0_999._860_Lemonade_Change;

class Solution {

    /*
    track number of 20, 10, and 5 bills
    when I have to give the rest I subtract from the higher possible bill
     */
    public boolean lemonadeChange(int[] bills) {

        int n5 = 0;
        int n10 = 0;
        for (int bill : bills) {
            if (bill == 5) {
                n5++;
            } else if (bill == 10) {
                // I have to use 5
                if (n5 > 0) {
                    n5--;
                    n10++;
                } else {
                    return false;
                }
            } else { // it has to be 20
                // firs try 10 + 5
                if (n10 > 0 && n5 > 0) {
                    n10--;
                    n5--;
                } else if (n5 >= 3) {
                    n5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}