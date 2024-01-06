package solutions.algorithms._0_999._108_Convert_Sorted_Array_to_Binary_Search_Tree;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._108_Convert_Sorted_Array_to_Binary_Search_Tree.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void sortedArrayToBSTTest1() {

        int[] input = new int[]{-10, -3, 0, 5, 9};
        TreeNode actual = solution.sortedArrayToBST(input);
        Assertions.assertEquals(0, actual.val);
        Assertions.assertEquals(-3, actual.left.val);
        Assertions.assertEquals(-10, actual.left.left.val);
        Assertions.assertEquals(9, actual.right.val);
        Assertions.assertEquals(5, actual.right.left.val);

        Assertions.assertNull(actual.left.right);
        Assertions.assertNull(actual.right.right);
    }

    @Test
    void sortedArrayToBSTTest2() {

        int[] input = new int[]{1, 3};
        TreeNode actual = solution.sortedArrayToBST(input);
        Assertions.assertEquals(3, actual.val);
        Assertions.assertEquals(1, actual.left.val);
        Assertions.assertNull(actual.right);
    }

    @Test
    void sortedArrayToBSTTest3() {

        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        TreeNode actual = solution.sortedArrayToBST(input);

        TreeNode left = actual.left;
        TreeNode right = actual.right;
        TreeNode leftLeft = left.left;
        TreeNode leftRight = left.right;
        TreeNode leftLeftLeft = leftLeft.left;
        TreeNode leftLeftRight = leftLeft.right;
        TreeNode leftRightLeft = leftRight.left;
        TreeNode leftRightRight = leftRight.right;
        TreeNode rightLeft = right.left;
        TreeNode rightLeftLeft = rightLeft.left;
        TreeNode rightLeftRight = rightLeft.right;
        TreeNode rightRight = right.right;
        TreeNode rightRightLeft = rightRight.left;
        TreeNode rightRightRight = rightRight.right;

        Assertions.assertEquals(6, actual.val);
        Assertions.assertEquals(3, left.val);
        Assertions.assertEquals(9, right.val);
        Assertions.assertEquals(2, leftLeft.val);
        Assertions.assertEquals(5, leftRight.val);
        Assertions.assertEquals(1, leftLeftLeft.val);
        Assertions.assertEquals(4, leftRightLeft.val);
        Assertions.assertEquals(8, rightLeft.val);
        Assertions.assertEquals(7, rightLeftLeft.val);
        Assertions.assertEquals(10, rightRight.val);
        Assertions.assertNull(leftLeftRight);
        Assertions.assertNull(leftRightRight);
        Assertions.assertNull(rightLeftRight);
        Assertions.assertNull(rightRightLeft);
        Assertions.assertNull(rightRightRight);
    }
}