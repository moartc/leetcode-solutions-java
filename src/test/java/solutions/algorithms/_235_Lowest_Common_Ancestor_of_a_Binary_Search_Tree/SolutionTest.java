package solutions.algorithms._235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

import commons.TreeNode;
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
    void lowestCommonAncestorTest1() {
        TreeNode t4 = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode t2 = new TreeNode(2, new TreeNode(0), t4);
        TreeNode t8 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode t6 = new TreeNode(6, t2, t8);
        Assertions.assertEquals(6, solution.lowestCommonAncestor(t6, t2, t8).val);
    }

    @Test
    void lowestCommonAncestorTest2() {
        TreeNode t4 = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode t2 = new TreeNode(2, new TreeNode(0), t4);
        TreeNode t8 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode t6 = new TreeNode(6, t2, t8);
        Assertions.assertEquals(2, solution.lowestCommonAncestor(t6, t2, t4).val);
    }
}