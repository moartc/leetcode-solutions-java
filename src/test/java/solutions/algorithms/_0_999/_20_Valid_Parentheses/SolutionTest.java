package solutions.algorithms._0_999._20_Valid_Parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void isValidTest1() {
        String input = "()";
        Assertions.assertTrue(solution.isValid(input));
    }

    @Test
    void isValidTest2() {
        String input = "()[]{}";
        Assertions.assertTrue(solution.isValid(input));
    }

    @Test
    void isValidTest3() {
        String input = "(]";
        Assertions.assertFalse(solution.isValid(input));
    }

    @Test
    void isValidTest4() {
        String input = "([)]";
        Assertions.assertFalse(solution.isValid(input));
    }

    @Test
    void isValidTest5() {
        String input = "{[]}";
        Assertions.assertTrue(solution.isValid(input));
    }

    @Test
    void isValidTest6() {
        String input = "]";
        Assertions.assertFalse(solution.isValid(input));
    }
}