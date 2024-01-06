package solutions.algorithms._0_999._145_Binary_Tree_Postorder_Traversal;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._145_Binary_Tree_Postorder_Traversal.Solution;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void postorderTraversalTest1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expected = List.of(3, 2, 1);
        List<Integer> actual = solution.postorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void postorderTraversalTest2() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        List<Integer> actual = solution.postorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void postorderTraversalTest3() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        List<Integer> actual = solution.postorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void postorderTraversalTest4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<Integer> expected = List.of(2, 1);
        List<Integer> actual = solution.postorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void postorderTraversalTest5() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        List<Integer> expected = List.of(2, 1);
        List<Integer> actual = solution.postorderTraversal(root);
        Assertions.assertIterableEquals(expected, actual);
    }
}