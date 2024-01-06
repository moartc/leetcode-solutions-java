package solutions.algorithms._0_999._171_Excel_Sheet_Column_Number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._171_Excel_Sheet_Column_Number.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void titleToNumberTest1() {
        String columnTitle = "A";
        int expected = 1;
        int actual = solution.titleToNumber(columnTitle);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void titleToNumberTest2() {
        String columnTitle = "AB";
        int expected = 28;
        int actual = solution.titleToNumber(columnTitle);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void titleToNumberTest3() {
        String columnTitle = "ZY";
        int expected = 701;
        int actual = solution.titleToNumber(columnTitle);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void titleToNumberTest4() {
        String columnTitle = "FXSHRXW";
        int expected = 2147483647;
        int actual = solution.titleToNumber(columnTitle);
        Assertions.assertEquals(expected, actual);
    }
}