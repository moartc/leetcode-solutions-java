package solutions.algorithms._0_999._904_Fruit_Into_Baskets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void totalFruit1() {
        int[] fruits = new int[]{1, 2, 1};
        int answer = solution.totalFruit(fruits);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void totalFruit2() {
        int[] fruits = new int[]{0, 1, 2, 2};
        int answer = solution.totalFruit(fruits);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void totalFruit3() {
        int[] fruits = new int[]{1, 2, 3, 2, 2};
        int answer = solution.totalFruit(fruits);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}