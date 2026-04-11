package solutions.algorithms._3000_3999._3894_Traffic_Signal_Color;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void trafficSignal1() {
        int timer = 60;
        String answer = solution.trafficSignal(timer);
        Assertions.assertThat(answer).isEqualTo("Red");
    }

    @Test
    void trafficSignal2() {
        int timer = 5;
        String answer = solution.trafficSignal(timer);
        Assertions.assertThat(answer).isEqualTo("Invalid");
    }
}