package solutions.algorithms._2000_2999._2615_Sumof_Distances;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void distance1() {
        int[] nums = new int[]{1, 3, 1, 1, 2};
        long[] answer = solution.distance(nums);
        Assertions.assertThat(answer).containsExactly(5, 0, 3, 4, 0);
    }

    @Test
    void distance2() {
        int[] nums = new int[]{0, 5, 3};
        long[] answer = solution.distance(nums);
        Assertions.assertThat(answer).containsExactly(0, 0, 0);
    }

    @Test
    void distance3() {
        int[] nums = new int[]{1,1,1,1,1};
        long[] answer = solution.distance(nums);
        Assertions.assertThat(answer).containsExactly(10,7,6,7,10);
    }
}