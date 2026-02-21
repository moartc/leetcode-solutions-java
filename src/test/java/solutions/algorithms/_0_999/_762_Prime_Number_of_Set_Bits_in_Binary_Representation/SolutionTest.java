package solutions.algorithms._0_999._762_Prime_Number_of_Set_Bits_in_Binary_Representation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countPrimeSetBits1() {
        int left = 6;
        int right = 10;
        int answer = solution.countPrimeSetBits(left, right);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void countPrimeSetBits2() {
        int left = 10;
        int right = 15;
        int answer = solution.countPrimeSetBits(left, right);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}