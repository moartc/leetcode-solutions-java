package solutions.algorithms._3000_3999._3751_Total_Waviness_of_Numbers_in_Range_I;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int totalWaviness(int num1, int num2) {

        if (num2 < 100) {
            return 0;
        } else {
            int answer = 0;
            for (int num = num1; num <= num2; num++) {
                answer += countWaviness(num);
            }
            return answer;
        }
    }

    int countWaviness(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num != 0) {
            int r = num % 10;
            digits.add(r);
            num /= 10;
        }
        int ctr = 0;
        for (int i = 1; i < digits.size() - 1; i++) {
            int left = digits.get(i - 1);
            int middle = digits.get(i);
            int right = digits.get(i + 1);
            if (middle > left && middle > right) {
                ctr++;
            } else if (middle < left && middle < right) {
                ctr++;
            }
        }
        return ctr;
    }

}