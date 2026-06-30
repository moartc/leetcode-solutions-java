package solutions.algorithms._1000_1999._1358_Number_of_Substrings_Containing_All_Three_Characters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfSubstrings1() {
        String s = "abcabc";
        int answer = solution.numberOfSubstrings(s);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void numberOfSubstrings2() {
        String s = "aaacb";
        int answer = solution.numberOfSubstrings(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numberOfSubstrings3() {
        String s = "abc";
        int answer = solution.numberOfSubstrings(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void numberOfSubstrings5() {
        String s = "abcc";
        int answer = solution.numberOfSubstrings(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}