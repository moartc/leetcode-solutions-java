package solutions.algorithms._0_999._682_Baseball_Game;

import java.util.LinkedList;

class Solution {

    public int calPoints(String[] operations) {
        LinkedList<Integer> scores = new LinkedList<>();
        int totalSum = 0;
        for (String op : operations) {
            if (op.equals("C")) {
                totalSum -= scores.removeLast();
            } else if (op.equals("D")) {
                int toAdd = scores.getLast() * 2;
                scores.addLast( toAdd);
                totalSum += toAdd;
            } else if (op.equals("+")) {
                int toAdd = scores.getLast() + scores.get(scores.size() - 2);
                scores.addLast(toAdd);
                totalSum += toAdd;
            } else { // integer
                int toAdd = Integer.parseInt(op);
                scores.addLast(toAdd);
                totalSum += toAdd;
            }
        }
        return totalSum;
    }
}