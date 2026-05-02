package solutions.algorithms._0_999._788_Rotated_Digits;

class Solution {
    /*
    number should contain either 2, 5, 6 or 9 to make it good
    number must not contain 3, 4, 7 - these numbers make the number invalid
     */
    public int rotatedDigits(int n) {

        int ctr = 0;
        for (int i = 1; i <= n; i++) {
            boolean isValid = false;
            int currentNumber = i;
            while (currentNumber != 0) {
                int currDigit = currentNumber % 10;
                if (currDigit == 3 || currDigit == 4 || currDigit == 7) {
                    isValid = false;
                    break;
                } else if (currDigit == 2 || currDigit == 5 || currDigit == 6 || currDigit == 9) {
                    isValid = true;
                }
                currentNumber /= 10;
            }
            if (isValid) {
                ctr++;
            }
        }
        return ctr;
    }
}