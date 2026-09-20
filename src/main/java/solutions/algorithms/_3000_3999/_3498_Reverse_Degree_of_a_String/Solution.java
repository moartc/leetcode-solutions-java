package solutions.algorithms._3000_3999._3498_Reverse_Degree_of_a_String;

class Solution {


    /*
    a = 26
    b = 25
    ...
    a = 1
    formula: index = 'z' - char + 1
     */
    public int reverseDegree(String s) {

        char[] charArray = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            int idx = 'z' - charArray[i] + 1;
            int prod = (i + 1) * idx;
            sum += prod;
        }
        return sum;
    }
}