package solutions.algorithms._1000_1999._1967_Number_of_Strings_That_Appear_as_Substrings_in_Word;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numOfStrings1() {
        String[] patterns = new String[]{"a", "abc", "bc", "d"};
        String word = "abc";
        int answer = solution.numOfStrings(patterns, word);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numOfStrings2() {
        String[] patterns = new String[]{"a", "b", "c"};
        String word = "aaaaabbbbb";
        int answer = solution.numOfStrings(patterns, word);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void numOfStrings3() {
        String[] patterns = new String[]{"a", "a", "a"};
        String word = "ab";
        int answer = solution.numOfStrings(patterns, word);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}