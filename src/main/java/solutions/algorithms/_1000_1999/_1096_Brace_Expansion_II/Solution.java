package solutions.algorithms._1000_1999._1096_Brace_Expansion_II;

import java.util.*;

class Solution {
    public List<String> braceExpansionII(String expression) {

        char[] exp = expression.toCharArray();

        ListAndIndex parse = parse(exp, 0);
        Set<String> removeDup = new HashSet<>(parse.list);
        List<String> resResultUnsorted = new ArrayList<>(removeDup);
        Collections.sort(resResultUnsorted);
        return resResultUnsorted;
    }

    ListAndIndex parse(char[] exp, int currIdx) {

        List<String> currList = new ArrayList<>();
        List<String> currGlue = new ArrayList<>();
        currGlue.add("");
        for (int i = currIdx; i < exp.length; i++) {
            int c = exp[i];
            if (c == '{') {
                ListAndIndex parse = parse(exp, i + 1);
                // append it to the current list
                List<String> listFromNext = parse.list;
                List<String> newList = new ArrayList<>();
                for (String answer : currGlue) {
                    for (String s : listFromNext) {
                        String newStr = answer + s;
                        newList.add(newStr);
                    }
                }
                currGlue = newList;
                i = parse.index;
            } else if (c == ',') {
                // just go forward
                currList.addAll(currGlue);
                currGlue = new ArrayList<>();
                currGlue.add("");
            } else if (c == '}') {
                if (!currGlue.get(0).isEmpty()) {
                    currList.addAll(currGlue);
                }
                return new ListAndIndex(currList, i);
            } else { // it's a char
                List<String> newList = new ArrayList<>();
                for (String answer : currGlue) {
                    String newStr = answer + (char) c;
                    newList.add(newStr);
                }
                currGlue = newList;
            }
        }
        if (!currGlue.get(0).isEmpty()) {
            currList.addAll(currGlue);
        }
        return new ListAndIndex(currList, -1);
    }


    class ListAndIndex {
        public List<String> list;
        public int index;

        public ListAndIndex(List<String> list, int index) {
            this.list = list;
            this.index = index;
        }
    }


}