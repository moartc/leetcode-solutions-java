package solutions.algorithms._1000_1999._1200_Minimum_Absolute_Difference;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumAbsDifference1() {
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> answer = solution.minimumAbsDifference(arr);
        Assertions.assertThat(answer.get(0)).containsExactly(1, 2);
        Assertions.assertThat(answer.get(1)).containsExactly(2, 3);
        Assertions.assertThat(answer.get(2)).containsExactly(3, 4);
    }

    @Test
    void minimumAbsDifference2() {
        int[] arr = new int[]{1, 3, 6, 10, 15};
        List<List<Integer>> answer = solution.minimumAbsDifference(arr);
        Assertions.assertThat(answer.get(0)).containsExactly(1, 3);
    }

    @Test
    void minimumAbsDifference3() {
        int[] arr = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> answer = solution.minimumAbsDifference(arr);
        Assertions.assertThat(answer.get(0)).containsExactly(-14, -10);
        Assertions.assertThat(answer.get(1)).containsExactly(19, 23);
        Assertions.assertThat(answer.get(2)).containsExactly(23, 27);
    }
}