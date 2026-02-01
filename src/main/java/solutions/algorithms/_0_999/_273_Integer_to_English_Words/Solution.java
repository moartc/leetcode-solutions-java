package solutions.algorithms._0_999._273_Integer_to_English_Words;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private final static Map<Integer, String> intToWord = new HashMap<>();

    static {
        intToWord.put(1, "One");
        intToWord.put(2, "Two");
        intToWord.put(3, "Three");
        intToWord.put(4, "Four");
        intToWord.put(5, "Five");
        intToWord.put(6, "Six");
        intToWord.put(7, "Seven");
        intToWord.put(8, "Eight");
        intToWord.put(9, "Nine");
        intToWord.put(10, "Ten");
        intToWord.put(11, "Eleven");
        intToWord.put(12, "Twelve");
        intToWord.put(13, "Thirteen");
        intToWord.put(14, "Fourteen");
        intToWord.put(15, "Fifteen");
        intToWord.put(16, "Sixteen");
        intToWord.put(17, "Seventeen");
        intToWord.put(18, "Eighteen");
        intToWord.put(19, "Nineteen");
        intToWord.put(20, "Twenty");
        intToWord.put(30, "Thirty");
        intToWord.put(40, "Forty");
        intToWord.put(50, "Fifty");
        intToWord.put(60, "Sixty");
        intToWord.put(70, "Seventy");
        intToWord.put(80, "Eighty");
        intToWord.put(90, "Ninety");
    }


    /*
    the max value 2147483647 is:
    Two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven.

    general idea:
    create a list of ints to store units and maybe teens (since there is no ending), tens, hundreds, thousands, millions and billions

    I can "parse" the number by checking modulo and dividing by 10, 100, 1000 and so on.
    I will probably need some additional handling in a few cases (for sure for to teens)

    Then create a map of words for each number + "hundreds", "thousands" and so on.
    Go through this array, map values + additional "words" and construct the final answer.
    I already see that for thousands I might need 'reuse' parser for hundreds, since I can have 123 thousands

    also: I first have to check mod 100 or 10 (depending on whether I can detect teens)
    then for hundreds, mod 10
    then for thousands, millions and billions, mod 1000 0 to get hundreds
    it works and beats 85%, but during refactoring it turned out that it makes more sense to split it into chunks of 3 digits
     */
    public String numberToWords(int num) {

        /*
        0 - no ending
        1 - thousands
        2 - millions
        3 - billions
        all of them should be parsed in the same way
         */

        if (num == 0) {
            return "Zero";
        }
        int[] values = new int[6];

        int div = 1000;
        int arrIdx = 0;
        while (num > 0) {
            int mod = num % div;
            values[arrIdx] = mod;
            arrIdx++;
            num /= div;
        }
        // now - construct the answer, I should start from backward
        StringBuilder sb = new StringBuilder();
        if (values[3] != 0) {
            sb.append(intToWord.get(values[3]));
            sb.append(" Billion");
        }
        if (values[2] != 0) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(" ");
            }
            String parsedPart = parseHundred(values[2]);
            sb.append(parsedPart);
            sb.append(" Million");
        }
        if (values[1] != 0) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(" ");
            }
            String parsedPart = parseHundred(values[1]);
            sb.append(parsedPart);
            sb.append(" Thousand");
        }
        if (values[0] != 0) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(" ");
            }
            String parsedPart = parseHundred(values[0]);
            sb.append(parsedPart);
        }
        return sb.toString();
    }

    String parseHundred(int number) {
        StringBuilder sb = new StringBuilder();
        int numbOfHundreds = number / 100;
        if (numbOfHundreds != 0) {
            String numbOfHundredsString = intToWord.get(numbOfHundreds);
            sb.append(numbOfHundredsString);
            sb.append(" Hundred");
        }
        number = number % 100;
        // handle teens
        if (number > 10 && number < 20) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(" ");
            }
            sb.append(intToWord.get(number));
        } else {
            int tens = number / 10;
            if (tens != 0) {
                int valueToGet = 10 * tens;
                if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(" ");
                }
                sb.append(intToWord.get(valueToGet));
            }
            // units
            int units = number % 10;
            if (units != 0) {
                if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(" ");
                }
                sb.append(intToWord.get(units));
            }
        }
        return sb.toString();
    }

}