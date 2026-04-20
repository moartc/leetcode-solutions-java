package solutions.algorithms._2000_2999._2078_Two_Furthest_Houses_WithDifferent_Colors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxDistance1() {
        int[] colors = new int[]{1, 1, 1, 6, 1, 1, 1};
        int answer = solution.maxDistance(colors);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxDistance2() {
        int[] colors = new int[]{1, 8, 3, 8, 3};
        int answer = solution.maxDistance(colors);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxDistance3() {
        int[] colors = new int[]{0, 1};
        int answer = solution.maxDistance(colors);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxDistance4() {
        int[] colors = new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 19, 19, 6, 6};
        int answer = solution.maxDistance(colors);
        Assertions.assertThat(answer).isEqualTo(10);
    }

}