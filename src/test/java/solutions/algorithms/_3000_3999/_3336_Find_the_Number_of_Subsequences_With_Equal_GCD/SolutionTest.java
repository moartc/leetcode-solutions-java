package solutions.algorithms._3000_3999._3336_Find_the_Number_of_Subsequences_With_Equal_GCD;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subsequencePairCount1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int answer = solution.subsequencePairCount(nums);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void subsequencePairCount2() {
        int[] nums = new int[]{10, 20, 30};
        int answer = solution.subsequencePairCount(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void subsequencePairCount3() {
        int[] nums = new int[]{1, 1, 1, 1};
        int answer = solution.subsequencePairCount(nums);
        Assertions.assertThat(answer).isEqualTo(50);
    }

    @Test
    void subsequencePairCount4() {
        int[] nums = new int[]{24, 26, 25, 20, 27, 27, 27, 27, 20, 27, 21, 27, 25, 20, 20, 23, 25, 21, 20, 29, 24, 21, 23, 25, 28, 21, 21, 28, 25, 21};
        int answer = solution.subsequencePairCount(nums);
        Assertions.assertThat(answer).isEqualTo(99415636);
    }

}