package solutions.algorithms._1000_1999._1520_Maximum_Number_of_Non_Overlapping_Substrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxNumOfSubstrings1() {
        String s = "adefaddaccc";
        List<String> answer = solution.maxNumOfSubstrings(s);
        Assertions.assertThat(answer).containsExactly("e", "f", "ccc");
    }

    @Test
    void maxNumOfSubstrings2() {
        String s = "abbaccd";
        List<String> answer = solution.maxNumOfSubstrings(s);
        Assertions.assertThat(answer).containsExactly("d", "bb", "cc");
    }

    @Test
    void maxNumOfSubstrings3() {
        String s = "abbaccd";
        List<String> answer = solution.maxNumOfSubstrings(s);
        Assertions.assertThat(answer).containsExactly("d", "bb", "cc");
    }

    @Test
    void maxNumOfSubstrings4() {
        String s = "adae";
        List<String> answer = solution.maxNumOfSubstrings(s);
        Assertions.assertThat(answer).containsExactly("d", "e");
    }

    @Test
    void maxNumOfSubstrings5() {
        String s = "abaabbcaaabbbccd";
        List<String> answer = solution.maxNumOfSubstrings(s);
        Assertions.assertThat(answer).containsExactly("d", "abaabbcaaabbbcc");
    }
}