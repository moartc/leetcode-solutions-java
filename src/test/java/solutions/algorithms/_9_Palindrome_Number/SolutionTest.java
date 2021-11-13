package solutions.algorithms._9_Palindrome_Number;

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
}