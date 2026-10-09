package solutions.algorithms._1000_1999._1541_Minimum_Insertions_to_Balance_a_Parentheses_String;

class Solution {

    public int minInsertions(String s) {

        char[] chars = s.toCharArray();
        int totalToInsert = 0;
        int counter = 0;
        for (char c : chars) {
            if (c == '(') {
                if (counter < 0) {
                    int abs = Math.abs(counter);
                    totalToInsert += (abs / 2);
                    if (abs % 2 != 0) {
                        totalToInsert += 2;
                    }
                    counter = 0;
                } else {
                    if (counter % 2 == 1) {
                        totalToInsert++;
                        counter--;
                    }
                }
                counter += 2;
            } else {
                counter--;
            }
        }
        if (counter > 0) {
            totalToInsert += counter;
        } else if (counter < 0) {
            int abs = Math.abs(counter);
            totalToInsert += (abs / 2);
            if (abs % 2 != 0) {
                totalToInsert += 2;
            }
        }
        return totalToInsert;
    }
}