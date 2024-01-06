package solutions.algorithms._10000_10999._10032_Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int actual = solution.minOperations(new int[]{2, 1, 3, 4}, 1);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void test2() {
        int actual = solution.minOperations(new int[]{2, 0, 2, 0}, 0);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void test3() {
        int actual = solution.minOperations(new int[]{9, 7, 9, 14, 8, 6}, 12);
        Assertions.assertThat(actual).isEqualTo(3);
    }

}