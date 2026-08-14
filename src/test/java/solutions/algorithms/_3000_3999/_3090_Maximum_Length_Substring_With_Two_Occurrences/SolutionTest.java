package solutions.algorithms._3000_3999._3090_Maximum_Length_Substring_With_Two_Occurrences;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumLengthSubstring1() {
        String s = "bcbbbcba";
        int answer = solution.maximumLengthSubstring(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maximumLengthSubstring2() {
        String s = "aaaa";
        int answer = solution.maximumLengthSubstring(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}