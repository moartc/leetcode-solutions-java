package solutions.algorithms._0_999._202_Happy_Number;

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
    @ValueSource(ints = {1, 7, 10, 13, 19, 23, 28, 31, 32, 70, 79, 91, 94, 100, 103, 109, 129, 291, 293, 649, 653})
    void isHappyTestTrue(int input) {
        boolean actual = solution.isHappy(input);
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5, 6, 8, 9, 11, 12, 15, 29, 33, 71, 80, 101, 102, 131, 292, 648})
    void isHappyTestFalse(int input) {
        boolean actual = solution.isHappy(input);
        Assertions.assertFalse(actual);
    }
}