package solutions.algorithms._0_999._405_Convert_a_Number_to_Hexadecimal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void toHex1() {
        int num = 26;
        String answer = solution.toHex(num);
        Assertions.assertThat(answer).isEqualTo("1a");
    }

    @Test
    void toHex2() {
        int num = -1;
        String answer = solution.toHex(num);
        Assertions.assertThat(answer).isEqualTo("ffffffff");
    }
}