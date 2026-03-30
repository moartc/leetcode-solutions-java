package solutions.algorithms._1000_1999._1470_Shuffle_the_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shuffle1() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] answer = solution.shuffle(nums, n);
        Assertions.assertThat(answer).containsExactly(2, 3, 5, 4, 1, 7);
    }

    @Test
    void shuffle2() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] answer = solution.shuffle(nums, n);
        Assertions.assertThat(answer).containsExactly(1, 4, 2, 3, 3, 2, 4, 1);
    }

    @Test
    void shuffle3() {
        int[] nums = new int[]{1, 1, 2, 2};
        int n = 2;
        int[] answer = solution.shuffle(nums, n);
        Assertions.assertThat(answer).containsExactly(1, 2, 1, 2);
    }
}