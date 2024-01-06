package solutions.algorithms._0_999._201_Bitwise_AND_of_Numbers_Range;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._201_Bitwise_AND_of_Numbers_Range.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rangeBitwiseAndTest1() {
        int left = 5;
        int right = 7;
        int expected = 4;
        int actual = solution.rangeBitwiseAnd(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void rangeBitwiseAndTest2() {
        int left = 0;
        int right = 0;
        int expected = 0;
        int actual = solution.rangeBitwiseAnd(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void rangeBitwiseAndTest3() {
        int left = 1;
        int right = 2147483647;
        int expected = 0;
        int actual = solution.rangeBitwiseAnd(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void rangeBitwiseAndTest4() {
        int left = 1;
        int right = 2;
        int expected = 0;
        int actual = solution.rangeBitwiseAnd(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void rangeBitwiseAndTest5() {
        int left = 7;
        int right = 9;
        int expected = 0;
        int actual = solution.rangeBitwiseAnd(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
