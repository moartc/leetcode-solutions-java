package solutions.algorithms._0_999._682_Baseball_Game;

import java.util.LinkedList;

class Solution {
    public int calPoints(String[] operations) {

        LinkedList<Integer> register = new LinkedList<>();

        for (String operation : operations) {
            if ("+".equals(operation)) {
                int penultimate = register.get(register.size() - 2);
                int last = register.getLast();
                register.add(penultimate + last);
            } else if ("D".equals(operation)) {
                register.add(register.getLast() * 2);
            } else if ("C".equals(operation)) {
                register.removeLast();
            } else { // it's a digit
                int value = Integer.parseInt(operation);
                register.add(value);
            }
        }
        int result = 0;
        for (Integer integer : register) {
            result += integer;
        }
        return result;
    }
}