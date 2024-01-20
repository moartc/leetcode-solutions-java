package solutions.algorithms._3000_3999._3010_Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution1 = new Solution();

    @Test
    void test1() {
        var arr = new int[]{5, 4, 3};
        var res = solution1.minimumCost(arr);

        Assertions.assertThat(res).isEqualTo(12);
    }

    @Test
    void test2() {
        var arr = new int[]{1, 2, 3, 12};
        var res = solution1.minimumCost(arr);

        Assertions.assertThat(res).isEqualTo(6);
    }

    @Test
    void test3() {
        var arr = new int[]{10, 3, 1, 1};
        var res = solution1.minimumCost(arr);

        Assertions.assertThat(res).isEqualTo(12);
    }

    @Test
    void test4() {
        var arr = new int[]{2, 16, 50, 35, 42, 11, 27, 24, 48, 4};
        var res = solution1.minimumCost(arr);

        Assertions.assertThat(res).isEqualTo(17);
    }
}