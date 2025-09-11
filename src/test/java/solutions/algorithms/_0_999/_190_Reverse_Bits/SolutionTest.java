package solutions.algorithms._0_999._190_Reverse_Bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseBitsTest1() {
        int input = 43261596;
        int expected = 964176192;
        int actual = solution.reverseBits(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reverseBitsTest2() {
        int input = -3;
        int expected = -1073741825;
        int actual = solution.reverseBits(input);
        Assertions.assertEquals(expected, actual);
    }
}