package solutions.algorithms._0_999._43_Multiply_Strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void multiplyTest1() {

        String num1 = "2";
        String num2 = "3";
        String expected = "6";
        String multiply = solution.multiply(num1, num2);
        Assertions.assertThat(multiply).isEqualTo(expected);
    }

    @Test
    void multiplyTest2() {

        String num1 = "123";
        String num2 = "456";
        String expected = "56088";
        String multiply = solution.multiply(num1, num2);
        Assertions.assertThat(multiply).isEqualTo(expected);
    }

    @Test
    void multiplyTest3() {

        String num1 = "12";
        String num2 = "98";
        String expected = "1176";
        String multiply = solution.multiply(num1, num2);
        Assertions.assertThat(multiply).isEqualTo(expected);
    }

    @Test
    void multiplyTest4() {

        String num1 = "1234567888";
        String num2 = "9864565464";
        String expected = "12178475750928220032";
        String multiply = solution.multiply(num1, num2);
        Assertions.assertThat(multiply).isEqualTo(expected);
    }

    @Test
    void multiplyTest5() {

        String num1 = "1234567888";
        String num2 = "986456";
        String expected = "1217846900524928";
        String multiply = solution.multiply(num1, num2);
        Assertions.assertThat(multiply).isEqualTo(expected);
    }

    @Test
    void multiplyTest6() {

        String num1 = "123456";
        String num2 = "9864565464";
        String expected = "1217839793923584";
        String multiply = solution.multiply(num1, num2);
        Assertions.assertThat(multiply).isEqualTo(expected);
    }
}