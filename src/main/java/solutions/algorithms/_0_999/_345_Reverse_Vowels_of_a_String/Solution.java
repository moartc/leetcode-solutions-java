package solutions.algorithms._0_999._345_Reverse_Vowels_of_a_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    /*
    faster (hopefully) solution
     */
    public String reverseVowels(String s) {
        Set<Character> allVowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            while (l < chars.length && !allVowels.contains(chars[l])) {
                l++;
            }
            while (r >= 0 && !allVowels.contains(chars[r])) {
                r--;
            }
            if (l < r) {
                chars[l] = chars[r];
                chars[r] = chars[l];
                l++;
                r--;
            }
        }
        return String.valueOf(chars);
    }

    // old solution
    public String reverseVowels2(String s) {

        Set<Character> allVowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowelsFound = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (allVowels.contains(c)) {
                vowelsFound.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        int vowelIdx = vowelsFound.size() - 1;
        for (char c : s.toCharArray()) {
            if (allVowels.contains(c)) {
                sb.append(vowelsFound.get(vowelIdx));
                vowelIdx--;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}