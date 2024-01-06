package solutions.algorithms._0_999._191_Number_of_1_Bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._191_Number_of_1_Bits.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void hammingWeightTest1() {
        int input = 11;
        int expected = 3;
        int actual = solution.hammingWeight(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void hammingWeightTest2() {
        int input = 128;
        int expected = 1;
        int actual = solution.hammingWeight(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void hammingWeightTest3() {
        int input = -3;
        int expected = 31;
        int actual = solution.hammingWeight(input);
        Assertions.assertEquals(expected, actual);
    }
}