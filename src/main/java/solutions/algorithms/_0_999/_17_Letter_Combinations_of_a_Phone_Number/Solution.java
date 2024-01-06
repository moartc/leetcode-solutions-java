package solutions.algorithms._0_999._17_Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return List.of();
        }
        char[] ca = digits.toCharArray();
        int size = 1;
        for (char c : ca) {
            size *= mapping[c - 50].length;
        }
        List<char[]> arrResult = new ArrayList<>(size);
        append(ca, new char[digits.length()], 0, arrResult);

        List<String> result = new ArrayList<>(size);
        for (char[] resAr : arrResult) {
            result.add(new String(resAr));
        }
        return result;
    }

    void append(char[] digits, char[] current, int index, List<char[]> result) {
        if (index == digits.length) {
            result.add(current);
        } else {
            for (char c : mapping[digits[index] - 50]) {
                char[] newCurr = Arrays.copyOf(current, current.length);
                newCurr[index] = c;
                append(digits, newCurr, index + 1, result);
            }
        }
    }

    char[][] mapping = new char[][]{
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'},
    };
}