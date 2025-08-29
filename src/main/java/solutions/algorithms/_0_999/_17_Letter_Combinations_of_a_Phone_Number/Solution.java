package solutions.algorithms._0_999._17_Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
     seems very simple recursive method
     I will do mapping in a 2-dimension array
     idx [0] corresponds to digit 2

     later I replaced StringBuilder with an array of chars where I store the current combination. With that it beats 100%.
     */

    char[][] mapping = new char[][]{
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {

        // I prefer to handle it here, instead of checking every time inside "createCombinations" method if my string is not empty.
        if (digits.equals("")) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        createCombinations(0, new char[digits.length()], digits, result);

        return result;
    }

    private void createCombinations(int currentDigit, char[] sb, String digits, List<String> result) {

        if (currentDigit == digits.length()) {
            result.add(String.valueOf(sb));
            return;
        }

        char digitChar = digits.charAt(currentDigit);
        int digitIndex = digitChar - 48;

        for (Character c : mapping[digitIndex - 2]) {
            sb[currentDigit] = c;
            createCombinations(currentDigit + 1, sb, digits, result);

        }
    }
}