package solutions.algorithms._2000_2999._2709_Greatest_Common_Divisor_Traversal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canTraverseAllPairs1() {
        int[] nums = new int[]{2, 3, 6};

        boolean answer = solution.canTraverseAllPairs(nums);

        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canTraverseAllPairs2() {
        int[] nums = new int[]{3, 9, 5};

        boolean answer = solution.canTraverseAllPairs(nums);

        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canTraverseAllPairs3() {
        int[] nums = new int[]{4, 3, 12, 8};

        boolean answer = solution.canTraverseAllPairs(nums);

        Assertions.assertThat(answer).isTrue();
    }
}