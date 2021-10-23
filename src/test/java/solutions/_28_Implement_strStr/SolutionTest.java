package solutions._28_Implement_strStr;

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
    void strStrTest1() {
        int result = solution.strStr("hello", "ll");
        Assertions.assertEquals(2, result);
    }

    @Test
    void strStrTest2() {
        int result = solution.strStr("aaaaa", "bba");
        Assertions.assertEquals(-1, result);
    }

    @Test
    void strStrTest3() {
        int result = solution.strStr("", "");
        Assertions.assertEquals(0, result);
    }

    @Test
    void strStrTest4() {
        int result = solution.strStr("aa", "aaaa");
        Assertions.assertEquals(-1, result);
    }

    @Test
    void strStrTest5() {
        int result = solution.strStr("aaa", "aaa");
        Assertions.assertEquals(0, result);
    }

    @Test
    void strStrTest6() {
        int result = solution.strStr("mississippi", "issipi");
        Assertions.assertEquals(-1, result);
    }
}