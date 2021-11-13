package solutions.algorithms._111_Minimum_Depth_of_Binary_Tree;

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
    void minDepthTest1() {

        TreeNode left = new TreeNode(9, null, null);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);
        Assertions.assertEquals(2, solution.minDepth(root));
    }

    @Test
    void minDepthTest2() {

        TreeNode root = new TreeNode(3, null,
                new TreeNode(3, null,
                        new TreeNode(4, null,
                                new TreeNode(5, null,
                                        new TreeNode(6)))));
        Assertions.assertEquals(5, solution.minDepth(root));
            /*
                    2
                x      3
                         4
                            5
                          x   6
     */
    }

    @Test
    void minDepthTest3() {

        TreeNode leftRight = new TreeNode(-1, null, new TreeNode(3, new TreeNode(-2), null));
        TreeNode left = new TreeNode(-4, null, leftRight);

        TreeNode rightLeft = new TreeNode(8, null, new TreeNode(-9, new TreeNode(4), null));
        TreeNode right = new TreeNode(-3, rightLeft, null);

        TreeNode root = new TreeNode(0, left, right);
        Assertions.assertEquals(5, solution.minDepth(root));
            /*
                    0
            -4             -3
          x    -1        8      x
              x   3    x  -9
                -2 x     4
    [0,-4,-3,null,-1,8,null,null,3,null,-9,-2,null,4]
     */
    }


}