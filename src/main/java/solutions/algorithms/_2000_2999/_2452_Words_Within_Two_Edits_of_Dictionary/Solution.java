package solutions.algorithms._2000_2999._2452_Words_Within_Two_Edits_of_Dictionary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        Set<String> allMaps = new HashSet<>();
        for (String dicWord : dictionary) {
            StringBuilder sb = new StringBuilder(dicWord);
            char[] charArray = dicWord.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                sb.setCharAt(i, '*');
                allMaps.add(sb.toString());
                for (int j = i + 1; j < charArray.length; j++) {
                    sb.setCharAt(j, '*');
                    allMaps.add(sb.toString());
                    sb.setCharAt(j, charArray[j]);
                }
                sb.setCharAt(i, charArray[i]);
            }
        }

        List<String> answer = new ArrayList<>();
        ex:
        for (String query : queries) {
            StringBuilder sb = new StringBuilder(query);
            char[] charArray = query.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                sb.setCharAt(i, '*');
                if (allMaps.contains(sb.toString())) {
                    answer.add(query);
                    continue ex;
                }
                for (int j = i + 1; j < charArray.length; j++) {
                    sb.setCharAt(j, '*');
                    if (allMaps.contains(sb.toString())) {
                        answer.add(query);
                        continue ex;
                    }
                    sb.setCharAt(j, charArray[j]);
                }
                sb.setCharAt(i, charArray[i]);
            }
        }
        return answer;
    }
}