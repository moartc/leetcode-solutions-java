package solutions.algorithms._3000_3999._3014_Minimum_Number_of_Pushes_to_Type_Word_I;

class Solution {
    public int minimumPushes(String word) {
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            res += (i / 8) + 1;
        }
        return res;
    }
}