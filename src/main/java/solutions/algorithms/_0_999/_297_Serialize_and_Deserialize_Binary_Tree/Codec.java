package solutions.algorithms._0_999._297_Serialize_and_Deserialize_Binary_Tree;

import commons.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // ugly solution with keeping deserializing index as a global variable
    int currentDesIdx = 0;

    // I like preorder the most, so I am doing it this vay
    // string is comma separated list of integer values (without spaces) and 'n' for null value

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        ser(root, sb);
        // skip the first comma
        return sb.substring(1);
    }

    private void ser(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(',');
            sb.append('n');
        } else {
            sb.append(',');
            sb.append(node.val);
            //
            ser(node.left, sb);
            ser(node.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // split it to array of values
        String[] split = data.split(",");
        return des(split);
    }

    private TreeNode des(String[] split) {
        String value = split[currentDesIdx];
        currentDesIdx++;
        // if this value here is 'n' then I can just return null
        if (value.equals("n")) {
            return null;
        } else {
            // otherwise create the node
            int valueInt = Integer.parseInt(value);
            TreeNode node = new TreeNode(valueInt);
            node.left = des(split);
            node.right = des(split);
            // return it
            return node;
        }
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));