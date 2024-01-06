package solutions.algorithms._0_999._387_First_Unique_Character_in_a_String;

class Solution {
    public int firstUniqChar(String s) {
        char[] string = s.toCharArray();
        if (string.length == 1) {
            return 0;
        } else if (string.length == 2 && string[0] != string[1]) {
            return 0;
        } else {
            int[] chars = new int[26];
            for (char c : string) {
                chars[c - 97]++;
            }
            for(int i = 0; i < string.length; i++) {
                if(chars[string[i]-97] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}