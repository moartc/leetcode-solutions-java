package solutions._13_Roman_to_Integer;

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
    void romanToIntTest1() {

        String input = "III";
        int expected = 3;
        int actual = solution.romanToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void romanToIntTest2() {

        String input = "IV";
        int expected = 4;
        int actual = solution.romanToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void romanToIntTest3() {

        String input = "IX";
        int expected = 9;
        int actual = solution.romanToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void romanToIntTest4() {

        String input = "LVIII";
        int expected = 58;
        int actual = solution.romanToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void romanToIntTest5() {

        String input = "MCMXCIV";
        int expected = 1994;
        int actual = solution.romanToInt(input);
        Assertions.assertEquals(expected, actual);
    }
}