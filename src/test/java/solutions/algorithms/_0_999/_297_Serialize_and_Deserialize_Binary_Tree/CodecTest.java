package solutions.algorithms._0_999._297_Serialize_and_Deserialize_Binary_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CodecTest {

    private final Codec codec = new Codec();

    @Test
    void test1() {
        TreeNode rightNode = new TreeNode(3, new TreeNode(4), new TreeNode(5));
        TreeNode root = new TreeNode(1, new TreeNode(2), rightNode);


        Codec ser = new Codec();
        Codec deser = new Codec();

        TreeNode ans = deser.deserialize(ser.serialize(root));

        Assertions.assertThat(ans.val).isEqualTo(1);
        Assertions.assertThat(ans.left.val).isEqualTo(2);
        Assertions.assertThat(ans.right.val).isEqualTo(3);
        Assertions.assertThat(ans.right.left.val).isEqualTo(4);
        Assertions.assertThat(ans.right.right.val).isEqualTo(5);
    }

    @Test
    void test2() {
        TreeNode root = null;

        Codec ser = new Codec();
        Codec deser = new Codec();

        TreeNode ans = deser.deserialize(ser.serialize(root));

        Assertions.assertThat(ans).isEqualTo(null);
    }

}