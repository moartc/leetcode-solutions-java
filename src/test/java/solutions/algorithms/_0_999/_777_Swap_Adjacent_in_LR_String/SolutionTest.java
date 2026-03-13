package solutions.algorithms._0_999._777_Swap_Adjacent_in_LR_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canTransform1() {
        String start = "RXXLRXRXL";
        String result = "XRLXXRRLX";
        boolean answer = solution.canTransform(start, result);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canTransform2() {
        String start = "X";
        String result = "L";
        boolean answer = solution.canTransform(start, result);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canTransform3() {
        String start = "XXXXXLXXXLXXXX";
        String result = "XXLXXXXXXXXLXX";
        boolean answer = solution.canTransform(start, result);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canTransform4() {
        String start = "RXXL";
        String result = "XLRX";
        boolean answer = solution.canTransform(start, result);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canTransform5() {
        String start = "RLX";
        String result = "XLR";
        boolean answer = solution.canTransform(start, result);
        Assertions.assertThat(answer).isFalse();
    }
}