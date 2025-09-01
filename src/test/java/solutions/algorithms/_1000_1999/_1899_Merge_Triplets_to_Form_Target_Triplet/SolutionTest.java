package solutions.algorithms._1000_1999._1899_Merge_Triplets_to_Form_Target_Triplet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeTriplets1() {
        int[][] triplets = new int[][]{{2, 5, 3}, {1, 8, 4}, {1, 7, 5}};
        int[] target = new int[]{2, 7, 5};
        boolean answer = solution.mergeTriplets(triplets, target);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void mergeTriplets2() {
        int[][] triplets = new int[][]{{3, 4, 5}, {4, 5, 6}};
        int[] target = new int[]{3, 2, 5};
        boolean answer = solution.mergeTriplets(triplets, target);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void mergeTriplets3() {
        int[][] triplets = new int[][]{{2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}};
        int[] target = new int[]{5, 5, 5};
        boolean answer = solution.mergeTriplets(triplets, target);
        Assertions.assertThat(answer).isTrue();
    }
}