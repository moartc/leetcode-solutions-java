package solutions.algorithms._383_Ransom_Note;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] ransomOcc = new int[26];
        int[] magazineOcc = new int[26];

        for (char c : ransomNote.toCharArray()) {
            ransomOcc[c - 97]++;
        }
        for (char c : magazine.toCharArray()) {
            magazineOcc[c - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (ransomOcc[i] != 0 && ransomOcc[i] > magazineOcc[i]) {
                return false;
            }
        }
        return true;
    }
}