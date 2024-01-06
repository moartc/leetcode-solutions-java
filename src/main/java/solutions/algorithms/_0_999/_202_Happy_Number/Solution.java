package solutions.algorithms._0_999._202_Happy_Number;

class Solution {
    public boolean isHappy(int n) {

        while (true) {
            int result = 0;
            for (char c : String.valueOf(n).toCharArray()) {
                result += (c - 48) * (c - 48);
            }
            if (result == 1) {
                return true;
            } else if (result < 7) {
                return false;
            } else {
                n = result;
            }
        }
    }
}