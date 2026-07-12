package solutions.algorithms._1000_1999._1331_Rank_Transform_of_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void arrayRankTransform1() {
        int[] arr = new int[]{40, 10, 20, 30};
        int[] answer = solution.arrayRankTransform(arr);
        Assertions.assertThat(answer).containsExactly(4, 1, 2, 3);
    }

    @Test
    void arrayRankTransform2() {
        int[] arr = new int[]{100, 100, 100};
        int[] answer = solution.arrayRankTransform(arr);
        Assertions.assertThat(answer).containsExactly(1, 1, 1);
    }

    @Test
    void arrayRankTransform3() {
        int[] arr = new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] answer = solution.arrayRankTransform(arr);
        Assertions.assertThat(answer).containsExactly(5, 3, 4, 2, 8, 6, 7, 1, 3);
    }
}