package solutions.algorithms._0_999._696_Count_Binary_Substrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countBinarySubstrings1() {
        String s = "00110011";
        int answer = solution.countBinarySubstrings(s);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void countBinarySubstrings2() {
        String s = "10101";
        int answer = solution.countBinarySubstrings(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void countBinarySubstrings3() {
        String s = "1010001";
        int answer = solution.countBinarySubstrings(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}