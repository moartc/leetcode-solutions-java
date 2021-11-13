package solutions.algorithms._28_Implement_strStr;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        outer:
        for (int i = 0; i < haystackArray.length; i++) {
            if (haystackArray[i] == needleArray[0]) {
                int tmpIndex = i;
                for (char c : needleArray) {
                    if (tmpIndex >= haystackArray.length) {
                        return -1;
                    }
                    if (haystackArray[tmpIndex] != c) {
                        continue outer;
                    }
                    tmpIndex++;
                }
                return i;
            }
        }
        return -1;
    }
}