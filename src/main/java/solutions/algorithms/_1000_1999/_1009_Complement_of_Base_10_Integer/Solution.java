package solutions.algorithms._1000_1999._1009_Complement_of_Base_10_Integer;

class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) {
            return 1;
        }

        int answer = 0;
        int bit = 1;
        while (n != 0) {
            int r = n % 2;
            answer += ((r ^ 1) * bit);
            n = n / 2;
            bit <<= 1;
        }
        return answer;
    }

}