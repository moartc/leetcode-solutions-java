package solutions.algorithms._0_999._14_Longest_Common_Prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        for (int idx = 0; idx < strs[0].length(); idx++) {
            char firstChar = strs[0].charAt(idx);
            for (int i = 1; i < strs.length; i++) {
                if (idx < strs[i].length()) {
                    if (strs[i].charAt(idx) != firstChar) {
                        return strs[0].substring(0, idx);
                    }
                } else {
                    return strs[0].substring(0, idx);
                }
            }
        }
        return strs[0];
    }
}