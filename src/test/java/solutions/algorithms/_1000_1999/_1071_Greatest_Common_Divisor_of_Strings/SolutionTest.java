package solutions.algorithms._1000_1999._1071_Greatest_Common_Divisor_of_Strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void gcdOfStringsTest1() {

        var str1 = "ABCABC";
        var str2 = "ABC";
        String result = solution.gcdOfStrings(str1, str2);
        Assertions.assertThat(result).isEqualTo("ABC");
    }

    @Test
    void gcdOfStringsTest2() {

        var str1 = "ABABAB";
        var str2 = "ABAB";
        String result = solution.gcdOfStrings(str1, str2);
        Assertions.assertThat(result).isEqualTo("AB");
    }

    @Test
    void gcdOfStringsTest3() {

        var str1 = "LEET";
        var str2 = "CODE";
        String result = solution.gcdOfStrings(str1, str2);
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    void gcdOfStringsTest4() {

        var str1 = "ABCDEF";
        var str2 = "ABC";
        String result = solution.gcdOfStrings(str1, str2);
        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    void gcdOfStringsTest5() {

        var str1 = "AAAAAAAAA";
        var str2 = "AAACCC";
        String result = solution.gcdOfStrings(str1, str2);
        Assertions.assertThat(result).isEqualTo("");
    }
}