package solutions.algorithms._0_999._131_Palindrome_Partitioning;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
     notes:
     I can start from index 0 and recursively check for palindromes
     Example: "abcbaxyx"
     first take "a" add it to a temporary list, then call the method for "bcbaxyx",
     next take "b" -> add it, and then call the method for "cbaxyx"
     this handles the basic case where every single character is a palindrome

     For each starting point (like "a") I can move the end index and check if the substring is a palindrome
     "ab" is not a palindrome
     "abc" is not a palindrome
     until "abcba" which is a palindrome.
     Then I recurse on the remainder "xyx", doing the same: start with length 1 and expand it.

     The recursive function only needs a start parameter, and at each step I expand the end index from start up to the end.

     Then when I reach the end of the string I add the current partitions to the result.
     */
    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        doTheJob(0, new ArrayList<>(), result, s);
        return result;
    }


    void doTheJob(int start, List<String> current, List<List<String>> results, String s) {

        for (int endIndex = start; endIndex < s.length(); endIndex++) {

            if (isPalindrome(start, endIndex, s)) {

                // check if it's the end
                if (endIndex == s.length() - 1) {
                    List<String> newFound = new ArrayList<>(current);
                    newFound.add(s.substring(start, endIndex + 1));
                    results.add(newFound);
                    return;
                }

                // if it's palindrome here, add it
                current.add(s.substring(start, endIndex + 1));
                // do the same starting from the next one
                doTheJob(endIndex + 1, current, results, s);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(int start, int end, String s) {

        while (start < end) {
            char sc = s.charAt(start);
            char ec = s.charAt(end);
            if (sc != ec) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}