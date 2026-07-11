package solutions.algorithms._2000_2999._2685_Count_the_Number_of_Complete_Components;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countCompleteComponents1() {
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}, {3, 4}};
        int answer = solution.countCompleteComponents(n, edges);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void countCompleteComponents2() {
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}, {3, 4}, {3, 5}};
        int answer = solution.countCompleteComponents(n, edges);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}