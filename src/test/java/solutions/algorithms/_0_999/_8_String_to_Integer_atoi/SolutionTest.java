package solutions.algorithms._0_999._8_String_to_Integer_atoi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void myAtoi1() {
        String s = "42";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(42);
    }

    @Test
    void myAtoi2() {
        String s = " -042";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(-42);
    }

    @Test
    void myAtoi3() {
        String s = "1337c0d3";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(1337);
    }

    @Test
    void myAtoi4() {
        String s = "0-1";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void myAtoi5() {
        String s = "words and 987";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void myAtoi6() {
        String s = "21474836460";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(2147483647);
    }

    @Test
    void myAtoi7() {
        String s = "-2147483647";
        int answer = solution.myAtoi(s);
        Assertions.assertThat(answer).isEqualTo(-2147483647);
    }


}