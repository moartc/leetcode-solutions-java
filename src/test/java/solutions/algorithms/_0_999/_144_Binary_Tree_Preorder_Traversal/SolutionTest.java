package solutions.algorithms._0_999._144_Binary_Tree_Preorder_Traversal;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._144_Binary_Tree_Preorder_Traversal.Solution;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void preorderTraversalTest1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expected = List.of(1, 2, 3);
        List<Integer> actual = solution.preorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void preorderTraversalTest2() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        List<Integer> actual = solution.preorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void preorderTraversalTest3() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        List<Integer> actual = solution.preorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void preorderTraversalTest4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<Integer> expected = List.of(1, 2);
        List<Integer> actual = solution.preorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void preorderTraversalTest5() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        List<Integer> expected = List.of(1, 2);
        List<Integer> actual = solution.preorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }
}