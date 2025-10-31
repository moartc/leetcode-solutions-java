package solutions.algorithms._0_999._881_Boats_to_Save_People;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numRescueBoats1() {
        int[] people = new int[]{1, 2};
        int limit = 3;
        int answer = solution.numRescueBoats(people, limit);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void numRescueBoats2() {
        int[] people = new int[]{3, 2, 2, 1};
        int limit = 3;
        int answer = solution.numRescueBoats(people, limit);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numRescueBoats3() {
        int[] people = new int[]{3, 5, 3, 4};
        int limit = 5;
        int answer = solution.numRescueBoats(people, limit);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void numRescueBoats4() {
        int[] people = new int[]{3, 1, 7};
        int limit = 7;
        int answer = solution.numRescueBoats(people, limit);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void numRescueBoats5() {
        int[] people = new int[]{2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10};
        int limit = 50;
        int answer = solution.numRescueBoats(people, limit);
        Assertions.assertThat(answer).isEqualTo(11);
    }
}