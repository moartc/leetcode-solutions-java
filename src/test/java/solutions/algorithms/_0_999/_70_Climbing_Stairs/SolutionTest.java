package solutions.algorithms._0_999._70_Climbing_Stairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._70_Climbing_Stairs.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void climbStairsTest1() {

        int input = 2;
        int expected = 2;
        Assertions.assertEquals(expected, solution.climbStairs(input));
    }

    @Test
    void climbStairsTest2() {

        int input = 3;
        int expected = 3;
        Assertions.assertEquals(expected, solution.climbStairs(input));
    }

    @Test
    void climbStairsTest3() {

        int input = 4;
        int expected = 5;
        Assertions.assertEquals(expected, solution.climbStairs(input));
        /*
            1 1 1 1
              1 1 2
              1 2 1
              2 1 1
                2 2
            1 + (3 1) + (2 2)

         */

    }

    @Test
    void climbStairsTest4() {

        int input = 5;
        int expected = 8;
        Assertions.assertEquals(expected, solution.climbStairs(input));
        /*
            1 1 1 1 1
              1 1 1 2
              1 1 2 1
              1 2 1 1
              2 1 1 1
                1 2 2
                2 1 2
                2 2 1
            1 + (4 1) + (3 2)
         */
    }

    @Test
    void climbStairsTest5() {

        int input = 6;
        int expected = 13;
        Assertions.assertEquals(expected, solution.climbStairs(input));
        /*
            1 1 1 1 1 1
              1 1 1 1 2
              1 1 1 2 1
              1 1 2 1 1
              1 2 1 1 1
              2 1 1 1 1
                1 1 2 2
                1 2 1 2
                2 1 1 2
                1 2 2 1
                2 1 2 1
                2 2 1 1
                  2 2 2
            1 + (5 1) + (4 2) + (3 3)
         */
    }

    @Test
    void climbStairsTest6() {

        int input = 45;
        int expected = 1836311903;
        Assertions.assertEquals(expected, solution.climbStairs(input));
    }
}