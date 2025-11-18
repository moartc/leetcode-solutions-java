package solutions.algorithms._1000_1999._1011_Capacity_To_Ship_Packages_Within_D_Days;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shipWithinDays1() {
        int[] weights = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int answer = solution.shipWithinDays(weights, days);
        Assertions.assertThat(answer).isEqualTo(15);
    }

    @Test
    void shipWithinDays2() {
        int[] weights = new int[]{3, 2, 2, 4, 1, 4};
        int days = 3;
        int answer = solution.shipWithinDays(weights, days);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void shipWithinDays3() {
        int[] weights = new int[]{1, 2, 3, 1, 1};
        int days = 3;
        int answer = solution.shipWithinDays(weights, days);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void shipWithinDays4() {
        int[] weights = new int[]{1, 2, 3, 1, 1};
        int days = 4;
        int answer = solution.shipWithinDays(weights, days);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}