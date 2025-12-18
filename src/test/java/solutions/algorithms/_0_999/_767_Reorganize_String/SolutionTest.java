package solutions.algorithms._0_999._767_Reorganize_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reorganizeString1() {
        String s = "aab";
        String answer = solution.reorganizeString(s);
        Assertions.assertThat(answer).isEqualTo("aba");
    }

    @Test
    void reorganizeString2() {
        String s = "aaab";
        String answer = solution.reorganizeString(s);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void reorganizeString3() {
        String s = "aaaaaabbcde";
        String answer = solution.reorganizeString(s);
        Assertions.assertThat(answer).isEqualTo("ababadacaea");
    }
}