package solutions.algorithms._0_999._273_Integer_to_English_Words;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberToWords1() {
        int num = 123;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("One Hundred Twenty Three");
    }

    @Test
    void numberToWords2() {
        int num = 12345;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("Twelve Thousand Three Hundred Forty Five");
    }

    @Test
    void numberToWords3() {
        int num = 1234567;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
    }

    @Test
    void numberToWords4() {
        int num = 1234567891;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo(
                "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One");
    }

    @Test
    void numberToWords5() {
        int num = 10000;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("Ten Thousand");
    }

    @Test
    void numberToWords6() {
        int num = 25942;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("Twenty Five Thousand Nine Hundred Forty Two");
    }

    @Test
    void numberToWords7() {
        int num = 100009000;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("One Hundred Million Nine Thousand");
    }

    @Test
    void numberToWords8() {
        int num = 120313317;
        String answer = solution.numberToWords(num);
        Assertions.assertThat(answer).isEqualTo("One Hundred Twenty Million Three Hundred Thirteen Thousand Three Hundred Seventeen");
    }
}