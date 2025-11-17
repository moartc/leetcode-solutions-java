package solutions.algorithms._0_999._69_Sqrt_x;

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
    void mySqrtTest1() {

        int input = 4;
        int expected = 2;
        Assertions.assertEquals(expected, solution.mySqrt(input));
    }

    @Test
    void mySqrtTest2() {

        int input = 8;
        int expected = 2;
        Assertions.assertEquals(expected, solution.mySqrt(input));
    }

    @Test
    void mySqrtTest3() {

        int input = 10;
        int expected = 3;
        Assertions.assertEquals(expected, solution.mySqrt(input));
    }

    @Test
    void mySqrtTest4() {

        int input = 0;
        int expected = 0;
        Assertions.assertEquals(expected, solution.mySqrt(input));
    }

    @Test
    void mySqrtTest5() {

        int input = 1;
        int expected = 1;
        Assertions.assertEquals(expected, solution.mySqrt(input));
    }

    @Test
    void mySqrtTest6() {

        int input = 2147395600;
        int expected = 46340;
        Assertions.assertEquals(expected, solution.mySqrt(input));
    }
}