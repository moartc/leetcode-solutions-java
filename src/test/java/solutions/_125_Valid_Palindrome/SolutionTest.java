package solutions._125_Valid_Palindrome;

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
        String input = "A man, a plan, a canal: Panama";
        boolean condition = solution.isPalindrome(input);
        Assertions.assertTrue(condition);
    }

    @Test
    void isPalindromeTest2() {
        String input = "race a car";
        boolean condition = solution.isPalindrome(input);
        Assertions.assertFalse(condition);
    }

    @Test
    void isPalindromeTest3() {
        String input = "0P";
        boolean condition = solution.isPalindrome(input);
        Assertions.assertFalse(condition);
    }
}