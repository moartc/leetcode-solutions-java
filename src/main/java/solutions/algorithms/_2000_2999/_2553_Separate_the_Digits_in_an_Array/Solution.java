package solutions.algorithms._2000_2999._2553_Separate_the_Digits_in_an_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            List<Integer> tempList = new ArrayList<>();
            int tempNum = num;
            while (tempNum != 0) {
                int rem = tempNum % 10;
                tempList.add(rem);
                tempNum /= 10;
            }
            Collections.reverse(tempList);
            list.addAll(tempList);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}