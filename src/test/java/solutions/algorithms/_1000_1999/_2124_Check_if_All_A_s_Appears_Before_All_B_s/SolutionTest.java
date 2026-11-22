package solutions.algorithms._1000_1999._2124_Check_if_All_A_s_Appears_Before_All_B_s;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkString1() {
        String s = "aaabbb";
        boolean answer = solution.checkString(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkString2() {
        String s = "abab";
        boolean answer = solution.checkString(s);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void checkString3() {
        String s = "bbb";
        boolean answer = solution.checkString(s);
        Assertions.assertThat(answer).isTrue();
    }
}