package solutions.algorithms._0_999._7_Reverse_Integer;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    I can simply iterate by 10s and collect the numbers into an array
    Then I can rebuild the number.
    The most important part is the highest digit, which cannot be greater than 2,
    and it can be 2 only with some additional exceptions. Basically, it must not exceed Integer.MAX_VALUE
    The same applies to the negative side.

    max: 2147483647

    The solution is divided into 2 cases, but I am leaving it as it is.
     */

    public int reverse(int x) {

        int nx = x;
        List<Integer> numbers = new ArrayList<>();
        if (x > 0) {
            while (nx > 0) {
                int n = nx % 10;
                numbers.add(n);
                nx = nx / 10;
            }
            int m = 1;
            int res = 0;
            // max is 2147483647
            for (int i = numbers.size() - 1; i >= 0; i--) {
                int num = numbers.get(i);
                if (m == 1000000000) {
                    if (num > 2) {
                        return 0;
                    } else if (num == 2) {
                        if (res > 147483647) {
                            return 0;
                        }
                    }
                }
                res += num * m;
                m *= 10;
            }
            return res;
        } else {
            while (nx < 0) {
                int n = nx % 10;
                numbers.add(n);
                nx = nx / 10;
            }
            int m = -1;
            int res = 0;
            for (int i = numbers.size() - 1; i >= 0; i--) {
                int num = numbers.get(i);
                /*
                so basically, that's the minimum I can accept: −2147483648
                if m == -1000000000, then I can accept it only if num == 0 or 1 or is equal to 2
                and the current sum > -147483648
                 */
                if (m == -1000000000) {
                    if (num < -2) {
                        return 0;
                    } else if (num == -2) {
                        if (res < -147483648) {
                            return 0;
                        }
                    }
                }
                res += -num * m;
                m *= 10;
            }
            return res;
        }
    }
}
