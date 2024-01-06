package solutions.algorithms._0_999._104_Maximum_Depth_of_Binary_Tree;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._104_Maximum_Depth_of_Binary_Tree.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void maxDepthTest1() {

        TreeNode input = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        input.left = left;
        input.right = right;
        int actual = solution.maxDepth(input);
        Assertions.assertEquals(3, actual);
    }

    @Test
    void maxDepthTest2() {

        TreeNode input = new TreeNode(1, null, new TreeNode(2));
        int actual = solution.maxDepth(input);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void maxDepthTest3() {

        TreeNode input = null;
        int actual = solution.maxDepth(input);
        Assertions.assertEquals(0, actual);
    }

    @Test
    void maxDepthTest4() {

        TreeNode input = new TreeNode(0);
        int actual = solution.maxDepth(input);
        Assertions.assertEquals(1, actual);
    }
}