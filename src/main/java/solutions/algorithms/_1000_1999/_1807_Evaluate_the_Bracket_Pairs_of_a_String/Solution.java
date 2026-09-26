package solutions.algorithms._1000_1999._1807_Evaluate_the_Bracket_Pairs_of_a_String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> knowledgeMap = new HashMap<>();
        for (List<String> pair : knowledge) {
            String key = pair.get(0);
            String value = pair.get(1);
            knowledgeMap.put(key, value);
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder currWordSb = new StringBuilder();
        boolean buildKey = false;
        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];
            if (c == '(') {
                // do nothing
                buildKey = true;
            } else if (c == ')') {
                buildKey = false;
                String foundKey = currWordSb.toString();
                String valueToSet = knowledgeMap.getOrDefault(foundKey, "?");
                sb.append(valueToSet);
                currWordSb = new StringBuilder();
            } else { // char
                if (buildKey) {
                    currWordSb.append(c);
                } else {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}