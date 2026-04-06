package solutions.algorithms._1000_1999._1944_Number_of_Visible_People_in_a_Queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canSeePersonsCount1() {
        int[] heights = new int[]{10, 6, 8, 5, 11, 9};
        int[] answer = solution.canSeePersonsCount(heights);
        Assertions.assertThat(answer).containsExactly(3, 1, 2, 1, 1, 0);
    }

    @Test
    void canSeePersonsCount2() {
        int[] heights = new int[]{5, 1, 2, 3, 10};
        int[] answer = solution.canSeePersonsCount(heights);
        Assertions.assertThat(answer).containsExactly(4, 1, 1, 1, 0);
    }
}