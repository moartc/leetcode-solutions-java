package solutions.algorithms._2000_2999._2337_Move_Pieces_to_Obtain_a_String;

class Solution {
    public boolean canChange(String start, String target) {

        int s = 0;
        int t = 0;
        char[] startArr = start.toCharArray();
        char[] targetArr = target.toCharArray();
        while (s < startArr.length && t < targetArr.length) {
            if (startArr[s] != '_' && targetArr[t] != '_') {
                if (startArr[s] != targetArr[t]) {
                    return false;
                } else {
                    if (startArr[s] == 'L') {
                        if (t > s) {
                            return false;
                        }
                    } else { // R
                        if (s > t) {
                            return false;
                        }
                    }
                    s++;
                    t++;
                }
            } else if (startArr[s] != '_') {
                t++;
            } else if (targetArr[t] != '_') {
                s++;
            } else {
                t++;
                s++;
            }
        }
        while (s < startArr.length) {
            if (startArr[s] != '_') {
                return false;
            }
            s++;
        }
        while (t < targetArr.length) {
            if (targetArr[t] != '_') {
                return false;
            }
            t++;
        }
        return true;
    }
}