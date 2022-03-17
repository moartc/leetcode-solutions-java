package solutions.algorithms._234_Palindrome_Linked_List;

import commons.ListNode;
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
    void isPalindromeTest0False() {
        ListNode input = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(8,
                                                                        new ListNode(9
                                                                        )))))))));
        Assertions.assertFalse(solution.isPalindrome(input));
    }

    @Test
    void isPalindromeTest1True() {
        ListNode input = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1
                                ))));
        Assertions.assertTrue(solution.isPalindrome(input));
    }

    @Test
    void isPalindromeTest2False() {
        ListNode input = new ListNode(1,
                new ListNode(2));
        Assertions.assertFalse(solution.isPalindrome(input));
    }

    @Test
    void isPalindromeTest3True() {
        ListNode input = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(4,
                                                        new ListNode(3,
                                                                new ListNode(2,
                                                                        new ListNode(1
                                                                        )))))))));
        Assertions.assertTrue(solution.isPalindrome(input));
    }

    @Test
    void isPalindromeTest4False() {
        ListNode input = new ListNode(1,
                new ListNode(2,new ListNode(3)));
        Assertions.assertFalse(solution.isPalindrome(input));
    }
}
