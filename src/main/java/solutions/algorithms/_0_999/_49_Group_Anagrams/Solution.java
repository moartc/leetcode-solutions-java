package solutions.algorithms._0_999._49_Group_Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> mainMap = new HashMap<>();

        for (String str : strs) {
            Map<Character, Integer> map = new HashMap<>();

            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<String> list;
            if (mainMap.containsKey(map)) {
                list = mainMap.get(map);
            } else {
                list = new ArrayList<>();
            }
            list.add(str);
            mainMap.put(map, list);
        }

        return mainMap.values().stream().toList();
    }
}