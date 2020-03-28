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
}
