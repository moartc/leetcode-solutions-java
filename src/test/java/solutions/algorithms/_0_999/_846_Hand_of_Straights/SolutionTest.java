package solutions.algorithms._0_999._846_Hand_of_Straights;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isNStraightHandTest1() {

        int[] hand = new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        boolean answer = solution.isNStraightHand(hand, groupSize);

        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isNStraightHandTest2() {
        int[] hand = new int[]{1, 2, 3, 4, 5};
        int groupSize = 4;
        boolean answer = solution.isNStraightHand(hand, groupSize);

        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isNStraightHandTest3() {
        int[] hand = new int[]{1, 2, 3, 4, 5, 6};
        int groupSize = 2;
        boolean answer = solution.isNStraightHand(hand, groupSize);

        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isNStraightHandTest4() {
        int[] hand = new int[]{2, 1};
        int groupSize = 2;
        boolean answer = solution.isNStraightHand(hand, groupSize);

        Assertions.assertThat(answer).isTrue();
    }
}