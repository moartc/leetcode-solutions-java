package solutions.algorithms._3000_3999._3011_Find_if_Array_Can_Be_Sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canSortArrayTest1() {
        var arr = new int[]{8, 4, 2, 30, 15};
        boolean res = solution.canSortArray(arr);
        Assertions.assertTrue(res);
    }

    @Test
    void canSortArrayTest2() {
        var arr = new int[]{1, 2, 3, 4, 5};
        boolean res = solution.canSortArray(arr);
        Assertions.assertTrue(res);
    }

    @Test
    void canSortArrayTest3() {
        var arr = new int[]{3, 16, 8, 4, 2};
        boolean res = solution.canSortArray(arr);
        Assertions.assertFalse(res);
    }
}