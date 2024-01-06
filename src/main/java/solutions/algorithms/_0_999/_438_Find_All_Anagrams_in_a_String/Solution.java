package solutions.algorithms._0_999._438_Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int pLength = p.length();
        int[] pMap = new int[26];
        char[] schars = s.toCharArray();
        for (char c : p.toCharArray()) {
            pMap[c - 'a']++;
        }
        int[] sMap = new int[26];
        for (int i = 0; i < schars.length; i++) {
            sMap[schars[i] - 'a']++;
            if (i >= pLength) {
                sMap[schars[i - pLength] - 'a']--;
            }
            if (i >= pLength - 1 && Arrays.equals(sMap, pMap)) {
                result.add(i - pLength + 1);
            }
        }
        return result;
    }


}