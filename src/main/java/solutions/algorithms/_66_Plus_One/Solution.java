package solutions.algorithms._66_Plus_One;

class Solution {
    public int[] plusOne(int[] digits) {

        int index = digits.length - 1;
        while (true) {
            int digit = digits[index];
            if (digit == 9 && index != 0) {
                digits[index] = 0;
                index--;
            } else if (digit == 9) {
                int[] arrayToReturn = new int[digits.length + 1];
                System.arraycopy(digits, 1, arrayToReturn, 2, digits.length - 1);
                arrayToReturn[1] = 0;
                arrayToReturn[0] = 1;
                return arrayToReturn;
            } else {
                digits[index]++;
                return digits;
            }
        }
    }
}