package solutions.algorithms._0_999._7_Reverse_Integer;

class Solution {

    private static final int maxDivByTen = Integer.MAX_VALUE / 10;

    public int reverse(int x) {
        boolean isMinus = false;
        if (x < 0) {
            x = x * -1;
            isMinus = true;
        }
        int newInt = 0;
        int counter = 0;
        boolean overflow = false;
        while (x > 0) {
            counter++;
            newInt = newInt * 10 + (x % 10);
            x = x / 10;
            if (counter == 9 && (maxDivByTen - newInt) < 0) {
                overflow = true;
            }
        }
        if (counter == 10 && overflow) {
            return 0;
        } else {
            return isMinus ? -1 * newInt : newInt;
        }
    }
}
