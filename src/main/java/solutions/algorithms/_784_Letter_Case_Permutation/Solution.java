package solutions.algorithms._784_Letter_Case_Permutation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String s) {

        List<String> toReturn = new ArrayList<>();
        changeNext(new StringBuilder(), toReturn, s, 0);
        return toReturn;
    }

    void changeNext(StringBuilder currentStringBuilder, List<String> finalList, String s, int currentIndex) {
        if (currentIndex == s.length()) {
            finalList.add(currentStringBuilder.toString());
            return;
        }
        char current = s.charAt(currentIndex);
        if (Character.isLetter(current)) {
            changeNext(new StringBuilder(currentStringBuilder).append(Character.toUpperCase(current)), finalList, s, currentIndex + 1);
            changeNext(new StringBuilder(currentStringBuilder).append(Character.toLowerCase(current)), finalList, s, currentIndex + 1);
            changeNext(currentStringBuilder.append(current), finalList, s, currentIndex + 1);
        } else {
            changeNext(currentStringBuilder.append(current), finalList, s, currentIndex + 1);
        }
    }
}