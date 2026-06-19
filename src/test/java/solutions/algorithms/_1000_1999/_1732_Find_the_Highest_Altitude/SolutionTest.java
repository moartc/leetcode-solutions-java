package solutions.algorithms._1000_1999._1732_Find_the_Highest_Altitude;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestAltitude1() {
        int[] gain = new int[]{-5, 1, 5, 0, -7};
        int answer = solution.largestAltitude(gain);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void largestAltitude2() {
        int[] gain = new int[]{-4, -3, -2, -1, 4, 3, 2};
        int answer = solution.largestAltitude(gain);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}