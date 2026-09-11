package solutions.algorithms._3000_3999._3483_Unique_3_Digit_Even_Numbers;

class Solution {

    int ctr = 0;

    public int totalNumbers(int[] digits) {

        int[] allDigits = new int[10];
        for (int digit : digits) {
            allDigits[digit]++;
        }
        countAll(0, allDigits);
        return ctr;
    }

    private void countAll(int i, int[] digits) {

        if (i == 3) {
            // behind, something created, increase the counter
            ctr++;
        }
        int start = i == 0 ? 1 : 0;
        for (int j = start; j < 10; j++) {
            if ((i != 2 || (j % 2 == 0)) && digits[j] > 0) {
                digits[j]--;
                countAll(i + 1, digits);
                digits[j]++;
            }
        }
    }
}