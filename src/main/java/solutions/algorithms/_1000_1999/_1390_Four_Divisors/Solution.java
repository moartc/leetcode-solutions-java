package solutions.algorithms._1000_1999._1390_Four_Divisors;

class Solution {
    public int sumFourDivisors(int[] nums) {

        int answer = 0;
        for (int num : nums) {
            answer += getDivisorsSum(num);
        }
        return answer;

    }

    int getDivisorsSum(int n) {
        int divCtr = 0;
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    divCtr++;
                    sum += i;
                } else {
                    divCtr += 2;
                    sum += (n / i);
                    sum += i;
                }
                if (divCtr > 4) {
                    return 0;
                }
            }
        }
        if (divCtr == 4) {
            return sum;
        } else {
            return 0;
        }
    }
}