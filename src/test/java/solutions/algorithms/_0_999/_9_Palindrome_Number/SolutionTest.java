package solutions.algorithms._0_999._9_Palindrome_Number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._9_Palindrome_Number.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void isPalindromeTest1() {

        int input = 121;
        boolean actual = solution.isPalindrome(input);
        Assertions.assertTrue(actual);
    }

    @Test
    void isPalindromeTest2() {

        int input = -121;
        boolean actual = solution.isPalindrome(input);
        Assertions.assertFalse(actual);
    }

    @Test
    void isPalindromeTest3() {

        int input = 10;
        boolean actual = solution.isPalindrome(input);
        Assertions.assertFalse(actual);
    }

    @Test
    void isPalindromeTest4() {

        int input = -101;
        boolean actual = solution.isPalindrome(input);
        Assertions.assertFalse(actual);
    }

    @Test
    void isPalindromeTest5() {

        int input = 1410110141;
        boolean actual = solution.isPalindrome(input);
        Assertions.assertTrue(actual);
    }
}