package solutions.algorithms._1000_1999._1291_Sequential_Digits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sequentialDigits1() {
        int low = 100;
        int high = 300;
        List<Integer> answer = solution.sequentialDigits(low, high);
        Assertions.assertThat(answer).containsExactly(123, 234);
    }

    @Test
    void sequentialDigits2() {
        int low = 1000;
        int high = 13000;
        List<Integer> answer = solution.sequentialDigits(low, high);
        Assertions.assertThat(answer).containsExactly(1234, 2345, 3456, 4567, 5678, 6789, 12345);
    }
}