package solutions.algorithms._1000_1999._2124_Check_if_All_A_s_Appears_Before_All_B_s;

class Solution {

    /*
    it there was 'b' and then 'a' -> false
    otherwise -> true
     */
    public boolean checkString(String s) {
        boolean wasB = false;
        for (char c : s.toCharArray()) {
            if(c == 'a') {
                if(wasB) {
                    return false;
                }
            } else { // c == 'b'
                wasB = true;
            }
        }
        return true;
    }
}