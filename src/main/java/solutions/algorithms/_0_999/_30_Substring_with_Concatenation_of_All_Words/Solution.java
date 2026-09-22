package solutions.algorithms._0_999._30_Substring_with_Concatenation_of_All_Words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {


        Map<String, Integer> origMapWordToCtr = new HashMap<>();

        for (String word : words) {
            int ctr = origMapWordToCtr.getOrDefault(word, 0);
            origMapWordToCtr.put(word, ctr + 1);
        }

        int expectedSize = words.length * words[0].length();

        List<Integer> answer = new ArrayList<>();

        int w = words[0].length();
        for (int start = 0; start < w; start++) {
            Map<String, Integer> tempMap = new HashMap<>(origMapWordToCtr);
            int l = start;
            int r = start - w;
            while (r + w + w - 1 < s.length()) {
                r += w;
                String curr = s.substring(r, r + w);
                if (!tempMap.containsKey(curr)) {
                    // not in map at all
                    // reset map
                    tempMap = new HashMap<>(origMapWordToCtr);
                    // jump to the next one
                    l = r + w;
                    r = l - w; // r is 1 word behind so it adds it in the next loop iter
                } else {
                    int currCtr = tempMap.get(curr);
                    if (currCtr > 0) {
                        tempMap.put(curr, currCtr - 1);
                    } else {
                        // added too much I have to move left right
                        tempMap.put(curr, currCtr - 1); // still have to decrease
                        String leftW;
                        do {
                            leftW = s.substring(l, l + w);
                            Integer lCtr = tempMap.get(leftW);
                            tempMap.put(leftW, lCtr + 1);
                            l += w;
                        } while (!leftW.equals(curr));
                    }

                    // check if I found all
                    if (r - l + w == expectedSize && tempMap.values().stream().allMatch(x -> x == 0)) {
                        answer.add(l);
                        // jump to the next one
                        String currLeft = s.substring(l, l + w);
                        int lCtr = tempMap.get(currLeft);
                        tempMap.put(currLeft, lCtr + 1);
                        l = l + w;
                    }
                }
            }

        }
        return answer;
    }
}