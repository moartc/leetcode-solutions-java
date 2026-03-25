package solutions.algorithms._0_999._6_Zigzag_Conversion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void convert1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String answer = solution.convert(s, numRows);
        Assertions.assertThat(answer).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void convert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String answer = solution.convert(s, numRows);
        Assertions.assertThat(answer).isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    void convert3() {
        String s = "A";
        int numRows = 1;
        String answer = solution.convert(s, numRows);
        Assertions.assertThat(answer).isEqualTo("A");
    }
}