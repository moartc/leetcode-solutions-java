package solutions.algorithms._3000_3999._3074_Apple_Redistribution_into_Boxes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumBoxes1() {
        int[] apple = new int[]{1, 3, 2};
        int[] capacity = new int[]{4, 3, 1, 5, 2};
        int answer = solution.minimumBoxes(apple, capacity);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minimumBoxes2() {
        int[] apple = new int[]{5, 5, 5};
        int[] capacity = new int[]{2, 4, 2, 7};
        int answer = solution.minimumBoxes(apple, capacity);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}