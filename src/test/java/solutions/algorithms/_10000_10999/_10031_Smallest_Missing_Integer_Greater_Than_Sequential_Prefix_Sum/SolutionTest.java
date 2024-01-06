package solutions.algorithms._10000_10999._10031_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int actual = solution.missingInteger(new int[]{1, 2, 3, 2, 5});
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void test2() {
        int actual = solution.missingInteger(new int[]{3, 4, 5, 1, 12, 14, 13});
        Assertions.assertThat(actual).isEqualTo(15);
    }

    @Test
    void test3() {
        int actual = solution.missingInteger(new int[]{3, 4, 1});
        Assertions.assertThat(actual).isEqualTo(7);
    }

    @Test
    void test4() {
        int actual = solution.missingInteger(new int[]{29, 30, 31, 32, 33, 34, 35, 36, 37});
        Assertions.assertThat(actual).isEqualTo(297);
    }

    @Test
    void test5() {
        int actual = solution.missingInteger(new int[]{38});
        Assertions.assertThat(actual).isEqualTo(39);
    }

    @Test
    void test6() {

        int actual = solution.missingInteger(new int[]{46, 8, 2, 4, 1, 4, 10, 2, 4, 10, 2, 5, 7, 3, 1});
        Assertions.assertThat(actual).isEqualTo(47);
    }

    @Test
    void test7() {
        int actual = solution.missingInteger(new int[]{4, 45, 34, 5, 16, 46, 16});
        Assertions.assertThat(actual).isEqualTo(6);
    }
}