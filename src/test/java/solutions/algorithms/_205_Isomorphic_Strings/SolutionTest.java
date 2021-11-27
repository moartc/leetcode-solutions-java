package solutions.algorithms._205_Isomorphic_Strings;

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
    void isIsomorphicTest1() {
        String s = "egg";
        String t = "add";
        boolean actual = solution.isIsomorphic(s, t);
        Assertions.assertTrue(actual);
    }

    @Test
    void isIsomorphicTest2() {
        String s = "foo";
        String t = "bar";
        boolean actual = solution.isIsomorphic(s, t);
        Assertions.assertFalse(actual);
    }

    @Test
    void isIsomorphicTest3() {
        String s = "paper";
        String t = "title";
        boolean actual = solution.isIsomorphic(s, t);
        Assertions.assertTrue(actual);
    }

    @Test
    void isIsomorphicTest4() {
        String s = "badc";
        String t = "baba";
        boolean actual = solution.isIsomorphic(s, t);
        Assertions.assertFalse(actual);
    }
}