package solutions.algorithms._10000_10999._10033_Minimum_Number_of_Operations_to_Make_X_and_Y_Equal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int actual = solution.minimumOperationsToMakeEqual(26, 1);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void test2() {
        int actual = solution.minimumOperationsToMakeEqual(54, 2);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void test3() {
        int actual = solution.minimumOperationsToMakeEqual(25, 30);
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    void test4() {
        int actual = solution.minimumOperationsToMakeEqual(23, 5);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void test5() {
        int actual = solution.minimumOperationsToMakeEqual(89, 57);
        Assertions.assertThat(actual).isEqualTo(32);
    }

    @Test
    void test6() {
        int actual = solution.minimumOperationsToMakeEqual(9994, 5503);
        Assertions.assertThat(actual).isEqualTo(3506);
    }

    @Test
    void test7() {
        int actual = solution.minimumOperationsToMakeEqual(21, 5);
        Assertions.assertThat(actual).isEqualTo(3);
    }

}