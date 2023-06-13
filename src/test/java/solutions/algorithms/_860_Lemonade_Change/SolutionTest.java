package solutions.algorithms._860_Lemonade_Change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lemonadeChangeTest1() {
        int[] bills = new int[]{5, 5, 5, 10, 20};
        boolean answer = solution.lemonadeChange(bills);
        Assertions.assertThat(answer).isEqualTo(true);
    }

    @Test
    void lemonadeChangeTest2() {
        int[] bills = new int[]{5, 5, 10, 10, 20};
        boolean answer = solution.lemonadeChange(bills);
        Assertions.assertThat(answer).isEqualTo(false);
    }

    @Test
    void lemonadeChangeTest3() {
        int[] bills = new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
        boolean answer = solution.lemonadeChange(bills);
        Assertions.assertThat(answer).isEqualTo(true);
    }
}