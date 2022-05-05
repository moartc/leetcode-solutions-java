package solutions.algorithms._242_Valid_Anagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charsS = new int[26];
        int[] charsT = new int[26];
        for(int c : s.toCharArray()) {
            charsS[c - 97]++;
        }
        for(int c : t.toCharArray()) {
            charsT[c - 97]++;
        }
        for(int i = 0; i < 26;i++) {
            if(charsS[i] != charsT[i]) {
                return false;
            }
        }
        return true;
    }
}