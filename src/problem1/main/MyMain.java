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
    MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
    Scanner scan = new Scanner(System.in);

    int i = 7;
        System.out.println("Please take only 7 inputs");
        while (i > 0) {
        try {
            myBinarySearchTree.add(scan.nextInt());
        } catch (Exception e) {
            System.out.println("Error Occurred is \" " + e + " \", so you are going to be kicked-out \n");
            break;
        }
        i--;
    }
}
