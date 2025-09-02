package solutions.algorithms._0_999._678_Valid_Parenthesis_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkValidString1() {
        String s = "()";
        boolean answer = solution.checkValidString(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkValidString2() {
        String s = "(*)";
        boolean answer = solution.checkValidString(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkValidString3() {
        String s = "(*))";
        boolean answer = solution.checkValidString(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkValidString4() {
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        boolean answer = solution.checkValidString(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkValidString5() {
        String s = "(*())(()*((*(((()*())*()())(((((()*)()(((((()()))*)()))((())((((())))**(())()()()())((())(*())()*)()";
        boolean answer = solution.checkValidString(s);
        Assertions.assertThat(answer).isTrue();
    }


}