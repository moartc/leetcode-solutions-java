package solutions.algorithms._0_999._343_Integer_Break;

class Solution {

    /*
    the 2nd hint says I should check n ranging from 7 to 10
    7 = 12 (3+2+2) = 3x4
    8 = 18 (3+3+2) = 3x3*2
    9 = 27 (3+3+3) = 3x3
    10 = 36 (4+3+3) = 4x3x3
    so I want a combination of 3 and 2

    I subtract 3 as long as the remaining part > 1, and then for the remaining part I have 2 cases"
    - it divides by 3 without a reminded -> multiply by 3
    - otherwise it divides by 2 without a reminder -> multiply by the appropriate power of 2

    additional "special cases" for 1, 2 and 3
     */
    public int integerBreak(int n) {

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }
        int numberOfSubtracted3 = 0;
        while (n - 3 > 1) {
            n -= 3;
            numberOfSubtracted3++;
        }
        if (n % 3 == 0) {
            return (int) (Math.pow(3, numberOfSubtracted3 + 1));
        } else {
            int divBy2 = n / 2;
            return (int) (Math.pow(3, numberOfSubtracted3) * Math.pow(2, divBy2));
        }

    }
}