package solutions.algorithms._0_999._91_Decode_Ways;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._91_Decode_Ways.Solution;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numDecodingsTest1() {
        String s = "12";
        assertThat(solution.numDecodings(s)).isEqualTo(2);
    }

    @Test
    void numDecodingsTest2() {
        String s = "226";
        assertThat(solution.numDecodings(s)).isEqualTo(3);
    }

    @Test
    void numDecodingsTest3() {
        String s = "06";
        assertThat(solution.numDecodings(s)).isEqualTo(0);
    }

    @Test
    void numDecodingsTest4() {
        String s = "1";
        assertThat(solution.numDecodings(s)).isEqualTo(1);
    }

    @Test
    void numDecodingsTest5() {
        String s = "60";
        assertThat(solution.numDecodings(s)).isEqualTo(0);
    }

    @Test
    void numDecodingsTest6() {
        String s = "10";
        assertThat(solution.numDecodings(s)).isEqualTo(1);
    }

    @Test
    void numDecodingsTest7() {
        String s = "111111111111111111111111111111111111111111111";
        assertThat(solution.numDecodings(s)).isEqualTo(1836311903);
    }

    @Test
    void numDecodingsTest8() {
        String s = "1110";
        assertThat(solution.numDecodings(s)).isEqualTo(2);
    }

    @Test
    void numDecodingsTest9() {
        String s = "11111";
        assertThat(solution.numDecodings(s)).isEqualTo(8);
    }

    @Test
    void numDecodingsTest10() {
        String s = "111";
        assertThat(solution.numDecodings(s)).isEqualTo(3);
    }

    @Test
    void numDecodingsTest11() {
        String s = "11111111";
        assertThat(solution.numDecodings(s)).isEqualTo(34);
    }

    @Test
    void numDecodingsTest12() {
        String s = "2101";
        assertThat(solution.numDecodings(s)).isEqualTo(1);
    }
}