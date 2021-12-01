package solutions.algorithms._231_Power_of_Two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 8, 16, 128})
    void isPowerOfTwoTestTrue(int n) {
        Assertions.assertTrue(solution.isPowerOfTwo(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 5, 11, -2147483648})
    void isPowerOfTwoTestFalse(int n) {
        Assertions.assertFalse(solution.isPowerOfTwo(n));
    }
}