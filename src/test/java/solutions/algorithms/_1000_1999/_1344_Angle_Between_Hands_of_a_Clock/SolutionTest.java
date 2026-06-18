package solutions.algorithms._1000_1999._1344_Angle_Between_Hands_of_a_Clock;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void angleClock1() {
        int hour = 12;
        int minutes = 30;
        double answer = solution.angleClock(hour, minutes);
        Assertions.assertThat(answer).isEqualTo(165);
    }

    @Test
    void angleClock2() {
        int hour = 3;
        int minutes = 30;
        double answer = solution.angleClock(hour, minutes);
        Assertions.assertThat(answer).isEqualTo(75);
    }

    @Test
    void angleClock3() {
        int hour = 3;
        int minutes = 15;
        double answer = solution.angleClock(hour, minutes);
        Assertions.assertThat(answer).isEqualTo(7.5);
    }

    @Test
    void angleClock4() {
        int hour = 1;
        int minutes = 57;
        double answer = solution.angleClock(hour, minutes);
        Assertions.assertThat(answer).isEqualTo(76.50000);
    }
}