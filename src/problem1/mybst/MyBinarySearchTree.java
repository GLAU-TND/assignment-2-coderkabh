/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    public static StringBuilder preOrderString;
    public TreeNode root;
    private int count = 0;

    public MyBinarySearchTree() {
        this.root = null;
        preOrderString = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.getLeft());
        preOrder(root.getRight());
        preOrderString.append(root.getKey()).append(" ");
    }

    private void leftNode(TreeNode root) {
        if (root == null) return;
        else {

            if (root.getLeft() != null)
                System.out.println(root.getLeft().getKey());
            else
                count++;
            leftNode(root.getLeft());
            leftNode(root.getRight());
        }

    }
    public void printLeftNode() {
        leftNode(root);
    }

    public void countNotLeft() {
        System.out.println(count);
    }
}
