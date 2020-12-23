/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree


import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();

        myBinarySearchTree.add(12);
        myBinarySearchTree.add(23);
        myBinarySearchTree.add(34);
        myBinarySearchTree.add(65);
        myBinarySearchTree.add(25);
        myBinarySearchTree.add(19);
        myBinarySearchTree.add(88);
        myBinarySearchTree.add(33);
        myBinarySearchTree.add(63);
        myBinarySearchTree.add(11);

        MyQueue myQueue = new MyQueue();

        myQueue.preSuccessor(myBinarySearchTree.root);
        System.out.println("Pre-Order successor of all nodes are : ");
        myQueue.getPreSuccessor();

    }
}
