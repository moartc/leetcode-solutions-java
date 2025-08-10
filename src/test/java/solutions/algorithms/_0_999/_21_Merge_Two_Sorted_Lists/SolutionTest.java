package solutions.algorithms._0_999._21_Merge_Two_Sorted_Lists;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._21_Merge_Two_Sorted_Lists.Solution;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void mergeTwoListsTest1() {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode returned = solution.mergeTwoLists(l1, l2);
        List<Integer> actualList = new ArrayList<>();
        while (returned != null) {
            actualList.add(returned.val);
            returned = returned.next;
        }
        Assertions.assertIterableEquals(List.of(1, 1, 2, 3, 4, 4), actualList);
    }

    @Test
    void mergeTwoListsTest2() {

        ListNode l1 = null;
        ListNode l2 = null;

        ListNode returned = solution.mergeTwoLists(l1, l2);
        List<Integer> actualList = new ArrayList<>();
        while (returned != null) {
            actualList.add(returned.val);
            returned = returned.next;
        }
        Assertions.assertIterableEquals(List.of(), actualList);
    }

    @Test
    void mergeTwoListsTest3() {

        ListNode l1 = null;
        ListNode l2 = new ListNode(0);

        ListNode returned = solution.mergeTwoLists(l1, l2);
        List<Integer> actualList = new ArrayList<>();
        while (returned != null) {
            actualList.add(returned.val);
            returned = returned.next;
        }
        Assertions.assertIterableEquals(List.of(0), actualList);
    }

    @Test
    void mergeTwoListsTest4() {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(4)));

        ListNode returned = solution.mergeTwoLists(l1, l2);
        List<Integer> actualList = new ArrayList<>();
        while (returned != null) {
            actualList.add(returned.val);
            returned = returned.next;
        }
        Assertions.assertIterableEquals(List.of(1, 2, 2, 3, 4, 4), actualList);
    }

    @Test
    void mergeTwoListsTest5() {

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);

        ListNode returned = solution.mergeTwoLists(l1, l2);
        List<Integer> actualList = new ArrayList<>();
        while (returned != null) {
            actualList.add(returned.val);
            returned = returned.next;
        }
        Assertions.assertIterableEquals(List.of(1, 2), actualList);
    }

    @Test
    void mergeTwoListsTest6() {

        ListNode l1 = new ListNode(-9, new ListNode(3));
        ListNode l2 = new ListNode(5, new ListNode(7));

        ListNode returned = solution.mergeTwoLists(l1, l2);
        List<Integer> actualList = new ArrayList<>();
        while (returned != null) {
            actualList.add(returned.val);
            returned = returned.next;
        }
        Assertions.assertIterableEquals(List.of(-9,3,5,7), actualList);
    }
}