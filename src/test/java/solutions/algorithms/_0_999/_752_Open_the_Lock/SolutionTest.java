package solutions.algorithms._0_999._752_Open_the_Lock;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void openLock1() {
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        int answer = solution.openLock(deadends, target);

        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void openLock2() {
        String[] deadends = new String[]{"8888"};
        String target = "0009";
        int answer = solution.openLock(deadends, target);

        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void openLock3() {
        String[] deadends = new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target = "8888";
        int answer = solution.openLock(deadends, target);

        Assertions.assertThat(answer).isEqualTo(-1);
    }

}