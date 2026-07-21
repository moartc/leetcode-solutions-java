package solutions.algorithms._3000_3999._3499_Maximize_Active_Section_with_Trade_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxActiveSectionsAfterTrade1() {
        String s = "01";
        int answer = solution.maxActiveSectionsAfterTrade(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxActiveSectionsAfterTrade2() {
        String s = "0100";
        int answer = solution.maxActiveSectionsAfterTrade(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxActiveSectionsAfterTrade3() {
        String s = "1000100";
        int answer = solution.maxActiveSectionsAfterTrade(s);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void maxActiveSectionsAfterTrade4() {
        String s = "01010";
        int answer = solution.maxActiveSectionsAfterTrade(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxActiveSectionsAfterTrade5() {
        String s = "11";
        int answer = solution.maxActiveSectionsAfterTrade(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxActiveSectionsAfterTrade6() {
        String s = "101";
        int answer = solution.maxActiveSectionsAfterTrade(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}