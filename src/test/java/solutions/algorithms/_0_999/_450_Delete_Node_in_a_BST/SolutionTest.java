package solutions.algorithms._0_999._450_Delete_Node_in_a_BST;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {

        TreeNode left = new TreeNode(3);
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        right.right = new TreeNode(7);
        TreeNode root = new TreeNode(5);
        root.right = right;
        root.left = left;

        TreeNode afterDeletion = solution.deleteNode(root, 3);

        int rootV = afterDeletion.val;
        int leftV = afterDeletion.left.val;
        int rightV = afterDeletion.right.val;
        int leftR = afterDeletion.left.right.val;
        TreeNode leftLV = afterDeletion.left.left;
        TreeNode rightLN = afterDeletion.right.left;
        int rightRV = afterDeletion.right.right.val;

        Assertions.assertThat(rootV).isEqualTo(5);
        Assertions.assertThat(leftV).isEqualTo(2);
        Assertions.assertThat(rightV).isEqualTo(6);
        Assertions.assertThat(leftR).isEqualTo(4);
        Assertions.assertThat(leftLV).isNull();
        Assertions.assertThat(rightLN).isNull();
        Assertions.assertThat(rightRV).isEqualTo(7);
    }

    @Test
    void test2() {

        TreeNode left = new TreeNode(3);
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        right.right = new TreeNode(7);
        TreeNode root = new TreeNode(5);
        root.right = right;
        root.left = left;

        TreeNode afterDeletion = solution.deleteNode(root, 0);

        int rootV = afterDeletion.val;
        int leftV = afterDeletion.left.val;
        int rightV = afterDeletion.right.val;
        int leftLV = afterDeletion.left.left.val;
        int leftRV = afterDeletion.left.right.val;
        TreeNode rightLN = afterDeletion.right.left;
        int rightRV = afterDeletion.right.right.val;

        Assertions.assertThat(rootV).isEqualTo(5);
        Assertions.assertThat(leftV).isEqualTo(3);
        Assertions.assertThat(rightV).isEqualTo(6);
        Assertions.assertThat(leftLV).isEqualTo(2);
        Assertions.assertThat(leftRV).isEqualTo(4);
        Assertions.assertThat(rightLN).isNull();
        Assertions.assertThat(rightRV).isEqualTo(7);
    }

    @Test
    void test3() {

        TreeNode root = new TreeNode(0);

        TreeNode afterDeletion = solution.deleteNode(root, 0);

        Assertions.assertThat(afterDeletion).isNull();
    }

    @Test
    void test4() {

        TreeNode left = new TreeNode(3);
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        right.right = new TreeNode(7);
        TreeNode root = new TreeNode(5);
        root.right = right;
        root.left = left;

        TreeNode afterDeletion = solution.deleteNode(root, 5);

        Assertions.assertThat(afterDeletion.val).isEqualTo(4);
        Assertions.assertThat(afterDeletion.left.val).isEqualTo(3);
        Assertions.assertThat(afterDeletion.right.val).isEqualTo(6);
        Assertions.assertThat(afterDeletion.left.left.val).isEqualTo(2);
        Assertions.assertThat(afterDeletion.left.right).isNull();  // 4 was removed
        Assertions.assertThat(afterDeletion.right.left).isNull();
        Assertions.assertThat(afterDeletion.right.right.val).isEqualTo(7);
    }

    @Test
    void test5() {

        TreeNode left = new TreeNode(3);
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        right.right = new TreeNode(7);
        TreeNode root = new TreeNode(5);
        root.right = right;
        root.left = left;

        TreeNode afterDeletion = solution.deleteNode(root, 7);

        int rootV = afterDeletion.val;
        int leftV = afterDeletion.left.val;
        int rightV = afterDeletion.right.val;
        int leftLV = afterDeletion.left.left.val;
        int leftRV = afterDeletion.left.right.val;
        TreeNode rightLN = afterDeletion.right.left;
        TreeNode rightRN = afterDeletion.right.right;

        Assertions.assertThat(rootV).isEqualTo(5);
        Assertions.assertThat(leftV).isEqualTo(3);
        Assertions.assertThat(rightV).isEqualTo(6);
        Assertions.assertThat(leftLV).isEqualTo(2);
        Assertions.assertThat(leftRV).isEqualTo(4);
        Assertions.assertThat(rightLN).isNull();
        Assertions.assertThat(rightRN).isNull();
    }
}