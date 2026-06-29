package solutions.algorithms._1000_1999._1967_Number_of_Strings_That_Appear_as_Substrings_in_Word;

class Solution {

    public int numOfStrings(String[] patterns, String word) {

        int ctr = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                ctr++;
            }
        }
        return ctr;
    }
}