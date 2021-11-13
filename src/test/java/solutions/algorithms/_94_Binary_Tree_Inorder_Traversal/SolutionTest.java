package solutions.algorithms._94_Binary_Tree_Inorder_Traversal;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void inorderTraversal1() {

        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(2, new TreeNode(3), null);
        List<Integer> actual = solution.inorderTraversal(input);
        List<Integer> expected = List.of(1, 3, 2);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void inorderTraversal2() {
        TreeNode input = null;
        List<Integer> actual = solution.inorderTraversal(input);
        List<Integer> expected = List.of();
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void inorderTraversal3() {
        TreeNode input = new TreeNode(1);
        List<Integer> actual = solution.inorderTraversal(input);
        List<Integer> expected = List.of(1);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void inorderTraversal4() {
        TreeNode input = new TreeNode(1, new TreeNode(2), null);
        List<Integer> actual = solution.inorderTraversal(input);
        List<Integer> expected = List.of(2, 1);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void inorderTraversal5() {
        TreeNode input = new TreeNode(1, null, new TreeNode(2));
        List<Integer> actual = solution.inorderTraversal(input);
        List<Integer> expected = List.of(1, 2);
        Assertions.assertIterableEquals(expected, actual);
    }
}