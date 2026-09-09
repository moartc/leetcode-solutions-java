package solutions.algorithms._3000_3999._3871_Count_Commas_in_Range_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countCommas1() {
        long n = 1002;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void countCommas2() {
        long n = 998;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void countCommas3() {
        long n = 12344456878987L;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(48376826514952L);
    }

    @Test
    void countCommas4() {
        long n = 100000;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(99001);
    }

    @Test
    void countCommas5() {
        long n = 92000;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(91001);
    }

    @Test
    void countCommas6() {
        long n = 1000001;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(999004);
    }

    @Test
    void countCommas7() {
        long n = 1000001;
        long answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(999004);
    }
}