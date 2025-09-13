package solutions.algorithms._0_999._7_Reverse_Integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseTest1() {
        Assertions.assertEquals(321, solution.reverse(123));
    }

    @Test
    void reverseTest2() {
        Assertions.assertEquals(-321, solution.reverse(-123));
    }

    @Test
    void reverseTest3() {
        Assertions.assertEquals(21, solution.reverse(120));
    }

    @Test
    void reverseTest4() {
        Assertions.assertEquals(0, solution.reverse(1534236469));
    }

    @Test
    void reverseTest5() {
        Assertions.assertEquals(0, solution.reverse(1563847412));
    }

    @Test
    void reverseTest6() {
        Assertions.assertEquals(-2143847412, solution.reverse(-2147483412));
    }

    @Test
    void reverseTest7() {
        Assertions.assertEquals(214748365, solution.reverse(563847412));
    }

    @Test
    void reverseTest8() {
        Assertions.assertEquals(0, solution.reverse(-2147483648));
    }

    @Test
    void reverseTest9() {
        Assertions.assertEquals(2147483641, solution.reverse(1463847412));
    }


}
