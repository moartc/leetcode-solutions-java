package solutions._35_Search_Insert_Position;

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
    void searchInsertTest1() {

        int[] input = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(2, solution.searchInsert(input, 5));
    }

    @Test
    void searchInsertTest2() {

        int[] input = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(1, solution.searchInsert(input, 2));
    }

    @Test
    void searchInsertTest3() {

        int[] input = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(4, solution.searchInsert(input, 7));
    }

    @Test
    void searchInsertTest4() {

        int[] input = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(0, solution.searchInsert(input, 0));
    }

    @Test
    void searchInsertTest5() {

        int[] input = new int[]{1};
        Assertions.assertEquals(0, solution.searchInsert(input, 0));
    }

    @Test
    void searchInsertTest6() {

        int[] input = new int[]{1, 3, 5};
        Assertions.assertEquals(3, solution.searchInsert(input, 6));
    }
}