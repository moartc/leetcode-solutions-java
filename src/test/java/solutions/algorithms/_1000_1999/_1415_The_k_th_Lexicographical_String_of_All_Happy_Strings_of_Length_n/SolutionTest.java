package solutions.algorithms._1000_1999._1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getHappyString1() {
        int n = 1;
        int k = 3;
        String answer = solution.getHappyString(n, k);
        Assertions.assertThat(answer).isEqualTo("c");
    }

    @Test
    void getHappyString2() {
        int n = 1;
        int k = 4;
        String answer = solution.getHappyString(n, k);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void getHappyString3() {
        int n = 3;
        int k = 9;
        String answer = solution.getHappyString(n, k);
        Assertions.assertThat(answer).isEqualTo("cab");
    }
}