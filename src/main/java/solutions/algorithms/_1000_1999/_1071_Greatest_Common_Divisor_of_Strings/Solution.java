package solutions.algorithms._1000_1999._1071_Greatest_Common_Divisor_of_Strings;

class Solution {

    /*
    kinda brute force, but not the most stupid
    Select the shorter one and then, going from the max size down to 1, try whether each character matches
    I can skip cases where a substring of size x cannot divide both strings
     */
    public String gcdOfStrings(String str1, String str2) {

        String shorter = str1;
        String longer = str2;
        if (str1.length() > str2.length()) {
            shorter = str2;
            longer = str1;
        }
        for (int i = shorter.length(); i > 0; i--) {
            if (shorter.length() % i == 0 && longer.length() % i == 0) {
                if (isDivisor(shorter, longer, i)) {
                    return shorter.substring(0, i);
                }
            }
        }
        return "";
    }

    boolean isDivisor(String s, String l, int shortL) {
        int i = 0;
        while (i < l.length()) {
            int idx = i % shortL;
            char expectedChar = s.charAt(idx);
            if (i < s.length()) {
                if (s.charAt(i) != expectedChar) {
                    return false;
                }
            }
            if (l.charAt(i) != expectedChar) {
                return false;
            }
            i++;
        }
        return true;
    }
}
