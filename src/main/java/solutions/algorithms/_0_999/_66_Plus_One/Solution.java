package solutions.algorithms._0_999._66_Plus_One;

class Solution {

    /*
    Just carrying over the reminder
     */
    public int[] plusOne(int[] digits) {

        int lastIdx = digits.length - 1;
        int incrementedLastVal = digits[lastIdx] + 1;
        int reminder = incrementedLastVal == 10 ? 1 : 0;
        digits[lastIdx] = incrementedLastVal % 10;
        for (int i = lastIdx - 1; i >= 0; i--) {
            int value = digits[i] + reminder;
            if (value == 10) {
                digits[i] = 0;
                reminder = value / 10;
            } else {
                digits[i] = value;
                reminder = 0;
            }
        }

        if (reminder > 0) {
            // there is still a reminder - I need a new array
            int[] newArr = new int[digits.length + 1];
            System.arraycopy(digits, 0, newArr, 1, digits.length);
            newArr[0] = reminder;
            return newArr;
        } else {
            return digits;
        }
    }
}