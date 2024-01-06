package solutions.algorithms._0_999._168_Excel_Sheet_Column_Title;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._168_Excel_Sheet_Column_Title.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void convertToTitleTest1() {
        int columnNumber = 1;
        String expected = "A";
        String actual = solution.convertToTitle(columnNumber);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToTitleTest2() {
        int columnNumber = 28;
        String expected = "AB";
        String actual = solution.convertToTitle(columnNumber);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToTitleTest3() {
        int columnNumber = 701;
        String expected = "ZY";
        String actual = solution.convertToTitle(columnNumber);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToTitleTest4() {
        int columnNumber = 2147483647;
        String expected = "FXSHRXW";
        String actual = solution.convertToTitle(columnNumber);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToTitleTest5() {
        int columnNumber = 26;
        String expected = "Z";
        String actual = solution.convertToTitle(columnNumber);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToTitleTest6() {
        int columnNumber = 2;
        String expected = "B";
        String actual = solution.convertToTitle(columnNumber);
        Assertions.assertEquals(expected, actual);
    }
}