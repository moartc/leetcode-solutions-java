package solutions.algorithms._2000_2999._2243_Calculate_Digit_Sum_of_a_String;

class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            int n = s.length();
            StringBuilder newString = new StringBuilder();
            int i = 0;
            while (i < n) {
                int numb = 0;
                int j = i;
                while (j < i + k && j < n) {
                    numb += Integer.parseInt("" + s.charAt(j));
                    j++;
                }
                i = j;
                newString.append(numb);
            }
            s = newString.toString();
        }
        return s;
    }
}