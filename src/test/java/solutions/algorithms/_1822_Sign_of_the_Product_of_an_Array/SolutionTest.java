package solutions.algorithms._1822_Sign_of_the_Product_of_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void arraySignTest1() {
        int[] nums = new int[]{-1, -2, -3, -4, 3, 2, 1};
        int actual = solution.arraySign(nums);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void arraySignTest2() {
        int[] nums = new int[]{1, 5, 0, 2, -3};
        int actual = solution.arraySign(nums);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void arraySignTest3() {
        int[] nums = new int[]{-1, 1, -1, 1, -1};
        int actual = solution.arraySign(nums);
        Assertions.assertThat(actual).isEqualTo(-1);
    }
}