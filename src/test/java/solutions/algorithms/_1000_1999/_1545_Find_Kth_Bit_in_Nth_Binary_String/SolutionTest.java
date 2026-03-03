package solutions.algorithms._1000_1999._1545_Find_Kth_Bit_in_Nth_Binary_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findKthBit1() {
        int n = 3;
        int k = 1;
        char answer = solution.findKthBit(n, k);
        Assertions.assertThat(answer).isEqualTo('0');
    }

    @Test
    void findKthBit2() {
        int n = 4;
        int k = 11;
        char answer = solution.findKthBit(n, k);
        Assertions.assertThat(answer).isEqualTo('1');
    }

    @Test
    void findKthBit3() {
        int n = 4;
        int k = 4;
        char answer = solution.findKthBit(n, k);
        Assertions.assertThat(answer).isEqualTo('1');
    }

    @Test
    void findKthBit4() {
        int n = 3;
        int k = 5;
        char answer = solution.findKthBit(n, k);
        Assertions.assertThat(answer).isEqualTo('0');
    }

    @Test
    void findKthBit5() {
        int n = 4;
        int k = 12;
        char answer = solution.findKthBit(n, k);
        Assertions.assertThat(answer).isEqualTo('0');
    }

}