package solutions.algorithms._2000_2999._2914_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful;

class Solution {
    public int minChanges(String s) {

        char[] array = s.toCharArray();

        int ctr = 0;
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] != array[i + 1]) {
                ctr++;
            }
        }
        return ctr;
    }
}