package solutions.algorithms._0_999._344_Reverse_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseStringTest1() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        solution.reverseString(s);
        assertArrayEquals(expected, s);

    }

    @Test
    void reverseStringTest2() {
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        solution.reverseString(s);
        assertArrayEquals(expected, s);
    }
}
