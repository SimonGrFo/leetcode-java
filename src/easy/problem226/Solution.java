package easy.problem226;
// 226. Invert Binary Tree
// Given the root of a binary tree, invert the tree, and return its root.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * */

// [4,2,7,1,3,6,9]
//
//       4
//     /   \
//    2     7
//   / \   / \
//  1   3 6   9
// Visual display of the binary tree.

// The goal is to invert all of its children.

// basically, from [4,2,7,1,3,6,9] to [4,7,2,9,6,3,1]

class Solution {
    public TreeNode invertTree(TreeNode root) {
        // if node is null then there is nothing to invert
        if (root == null) {
            return null;
        }

        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively call invertTree on the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        // Return the root of the inverted tree
        return root;
    }
}
