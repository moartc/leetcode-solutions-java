package solutions.algorithms._3000_3999._3612_Process_String_with_Special_Operations_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void processStr1() {
        String s = "a#b%*";
        String answer = solution.processStr(s);
        Assertions.assertThat(answer).isEqualTo("ba");
    }

    @Test
    void processStr2() {
        String s = "z*#";
        String answer = solution.processStr(s);
        Assertions.assertThat(answer).isEqualTo("");
    }
}