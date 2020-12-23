/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        int i = 7;
        System.out.println("Please take only 7 inputs ...");
        while (i > 0) {
            try {
                myBinarySearchTree.add(scanner.nextInt());
            } catch (Exception x) {
                System.out.println("You Entered invalid no. ... you are kicked :) ");
                break;
            }
            i--;
        }

        MyBinarySearchTree.preOrder(myBinarySearchTree.root);
        System.out.println();
        myBinarySearchTree.postOrder(myBinarySearchTree.root);

    }
}

/*
 *   Running Pre-Order and Post-Order Traversals
 */

/*
*
* Input :> 4
                   2
                   6
                   1
                   3
                   5
                   7
**
 * > tree looks like
        *
                       8
                     /   \
                    4     9
                   / \    / \
                  2   6   7  11
*  The result is :
    a.)    8 4 2 6 9 7 11
    b.)    2 6 4 7 11 9 8
        So , b is correct.
*
**/