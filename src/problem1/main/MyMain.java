/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        Scanner scan = new Scanner(System.in);

        int i = 7;
        System.out.println("Please take only 7 inputs");
        while (i > 0) {
            try {
                myBinarySearchTree.add(scan.nextInt());
            } catch (Exception e) {
                System.out.println("Error Occurred: " + e);
                break;
            }
            i--;
        }
        System.out.println("All Left-children are :");
        myBinarySearchTree.printLeftNode();
        System.out.println("Number of nodes doesn't have left child :");
        myBinarySearchTree.countNotLeft();
    }

     /*
        *
        *
        * > tree structure is:
        *
                       6
                     /   \
                    1     8
                   / \    / \
                  5   1  2  3
        * Input :> 6
                   1
                   8
                   5
                   1
                   2
                   3
        *
        */


}
