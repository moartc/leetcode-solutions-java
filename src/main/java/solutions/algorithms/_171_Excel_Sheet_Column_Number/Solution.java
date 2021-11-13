package solutions.algorithms._171_Excel_Sheet_Column_Number;

class Solution {
    public int titleToNumber(String columnTitle) {
        char[] array = columnTitle.toCharArray();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[array.length - 1 - i] - 64;
            int power = (int) Math.pow(26, i);
            result += number * power;
        }
        return result;
    }
}