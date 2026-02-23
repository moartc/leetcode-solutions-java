package solutions.algorithms._1000_1999._1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hasAllCodes1() {
        String s = "00110110";
        int k = 2;
        boolean answer = solution.hasAllCodes(s, k);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void hasAllCodes2() {
        String s = "0110";
        int k = 1;
        boolean answer = solution.hasAllCodes(s, k);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void hasAllCodes3() {
        String s = "0110";
        int k = 2;
        boolean answer = solution.hasAllCodes(s, k);
        Assertions.assertThat(answer).isFalse();
    }
}