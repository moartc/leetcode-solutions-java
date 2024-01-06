package solutions.algorithms._0_999._258_Add_Digits;

class Solution {
    public int addDigits(int num) {

        while (num >= 10) {
            num = sum(num);
        }
        return num;
    }

    private int sum(int num) {
        int res = 0;
        int tmp;
        while (num > 0) {
            tmp = num % 10;
            res += tmp;
            num /= 10;
        }
        return res;
    }
}