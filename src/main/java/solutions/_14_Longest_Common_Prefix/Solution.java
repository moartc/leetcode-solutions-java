package solutions._14_Longest_Common_Prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String maxCommonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String toCheck = strs[i];
            if (toCheck.length() < maxCommonPrefix.length()) {
                String tmp = maxCommonPrefix;
                maxCommonPrefix = toCheck;
                toCheck = tmp;
            }
            for (int charIndex = 0; charIndex < toCheck.length(); charIndex++) {
                if (charIndex < maxCommonPrefix.length() && toCheck.charAt(charIndex) != maxCommonPrefix.charAt(charIndex)) {
                    maxCommonPrefix = maxCommonPrefix.substring(0, charIndex);
                    break;
                }
            }
        }
        return maxCommonPrefix;
    }
}