package solutions.algorithms._0_999._401_Binary_Watch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void readBinaryWatch1() {
        int turnedOn = 1;
        List<String> answer = solution.readBinaryWatch(turnedOn);
        Assertions.assertThat(answer).containsExactly("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00");
    }

    @Test
    void readBinaryWatch2() {
        int turnedOn = 9;
        List<String> answer = solution.readBinaryWatch(turnedOn);
        Assertions.assertThat(answer).isEmpty();
    }
}