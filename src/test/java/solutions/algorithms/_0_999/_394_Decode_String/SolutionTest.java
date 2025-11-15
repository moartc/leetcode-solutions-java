package solutions.algorithms._0_999._394_Decode_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void decodeString1() {
        String s = "3[a]2[bc]";
        String answer = solution.decodeString(s);
        Assertions.assertThat(answer).isEqualTo("aaabcbc");
    }

    @Test
    void decodeString2() {
        String s = "3[a2[c]]";
        String answer = solution.decodeString(s);
        Assertions.assertThat(answer).isEqualTo("accaccacc");
    }

    @Test
    void decodeString3() {
        String s = "2[abc]3[cd]ef";
        String answer = solution.decodeString(s);
        Assertions.assertThat(answer).isEqualTo("abcabccdcdcdef");
    }

}