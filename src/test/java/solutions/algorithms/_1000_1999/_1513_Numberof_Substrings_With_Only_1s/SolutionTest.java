package solutions.algorithms._1000_1999._1513_Numberof_Substrings_With_Only_1s;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSub1() {
        String s = "0110111";
        int answer = solution.numSub(s);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void numSub2() {
        String s = "101";
        int answer = solution.numSub(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void numSub3() {
        String s = "111111";
        int answer = solution.numSub(s);
        Assertions.assertThat(answer).isEqualTo(21);
    }
}