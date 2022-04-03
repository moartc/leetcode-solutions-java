package solutions.algorithms._1523_Count_Odd_Numbers_in_an_Interval_Range;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countOddsTest1() {
        int low = 3;
        int high = 7;
        int expected = 3;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest2() {
        int low = 8;
        int high = 10;
        int expected = 1;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest3() {
        int low = 8;
        int high = 8;
        int expected = 0;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest4() {
        int low = 9;
        int high = 9;
        int expected = 1;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest5() {
        int low = 9;
        int high = 10;
        int expected = 1;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest6() {
        int low = 8;
        int high = 9;
        int expected = 1;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest7() {
        int low = 1;
        int high = 6;
        int expected = 3;
        assertEquals(expected, solution.countOdds(low, high));
    }

    @Test
    void countOddsTest8() {
        int low = 2;
        int high = 7;
        int expected = 3;
        assertEquals(expected, solution.countOdds(low, high));
    }
}