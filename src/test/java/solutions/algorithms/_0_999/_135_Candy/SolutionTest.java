package solutions.algorithms._0_999._135_Candy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void candy1() {
        int[] ratings = new int[]{1, 0, 2};
        int answer = solution.candy(ratings);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void candy2() {
        int[] ratings = new int[]{1, 2, 2};
        int answer = solution.candy(ratings);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void candy3() {
        int[] ratings = new int[]{1, 2, 87,87,87,2,1};
        int answer = solution.candy(ratings);
        Assertions.assertThat(answer).isEqualTo(13);
    }
}