package solutions.algorithms._1000_1999._1291_Sequential_Digits;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        int minLength = getNumberOfDigits(low);
        int maxLength = getNumberOfDigits(high);

        List<Integer> result = new ArrayList<>();
        ex:
        for (int length = minLength; length <= maxLength; length++) {

            for (int firstDig = 1; firstDig <= 10 - length; firstDig++) {
                int currentNumber = 0;
                int currentDigit = firstDig;
                int mult = (int) Math.pow(10, length - 1);
                for (int i = 0; i < length; i++) {
                    currentNumber += (currentDigit * mult);
                    currentDigit++;
                    mult /= 10;
                }
                if (currentNumber < low) {
                    continue;
                }
                if (currentNumber > high) {
                    continue ex;
                }
                result.add(currentNumber);
            }
        }

        return result;
    }

    int getNumberOfDigits(int digit) {
        int ctr = 0;
        while (digit != 0) {
            digit /= 10;
            ctr++;
        }
        return ctr;
    }
}