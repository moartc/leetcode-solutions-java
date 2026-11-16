package solutions.algorithms._2000_2999._2243_Calculate_Digit_Sum_of_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void digitSum1() {
        String s = "11111222223";
        int k = 3;
        String answer = solution.digitSum(s, k);
        Assertions.assertThat(answer).isEqualTo("135");
    }

    @Test
    void digitSum2() {
        String s = "00000000";
        int k = 3;
        String answer = solution.digitSum(s, k);
        Assertions.assertThat(answer).isEqualTo("000");
    }

    @Test
    void digitSum3() {
        String s = "1234";
        int k = 2;
        String answer = solution.digitSum(s, k);
        Assertions.assertThat(answer).isEqualTo("37");
    }
}