package solutions.algorithms._1000_1999._1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n;

import java.util.ArrayList;
import java.util.List;


/*
at each position I can set [a,b,c] (but not all permutations make a happy string)
I can set at 0 3 strings
then 3-1 prev, then 3-1 prev and so on, so in total for the length n I can create: 3 * 2 * 2 .. * 2 strings, so the total number of strings = 3 * 2^(n-1)
I can generate all (sorted) and return k-1th
to improve I can use the same StringBuilder and after the recursive call delete char added before the call
I could change it to a regular loop as well
 */
class Solution {
    public String getHappyString(int n, int k) {
        int maxNumb = (int) (3 * Math.pow(2, n - 1));

        if (k > maxNumb) {
            return "";
        }
        List<String> allStrings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateAll(0, n, sb, allStrings);
        return allStrings.get(k - 1);
    }

    void generateAll(int currentIndex, int n, StringBuilder sb, List<String> allStrings) {
        if (currentIndex == n) {
            String generatedString = sb.toString();
            allStrings.add(generatedString);
        } else {
            if (currentIndex == 0) {
                for (char c : List.of('a', 'b', 'c')) {
                    sb.append(c);
                    generateAll(1, n, sb, allStrings);
                    sb.deleteCharAt(sb.length()-1);
                }
            } else {
                char lastString = sb.charAt(sb.length() - 1);
                for (char c : List.of('a', 'b', 'c')) {
                    if (c != lastString) {
                        sb.append(c);
                        generateAll(currentIndex + 1, n, sb, allStrings);
                        sb.deleteCharAt(sb.length()-1);
                    }
                }
            }
        }
    }
}