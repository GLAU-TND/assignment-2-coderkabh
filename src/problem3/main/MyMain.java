/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.push("Kanishk", 25);
        myPriorityQueue.push("Kardam", 26);
        myPriorityQueue.push("Kashika", 27);
        myPriorityQueue.push("I don't know name", 28);
        myPriorityQueue.push("Yeah! Not also this one", 29);
        myPriorityQueue.push("Keshav (Thaati)", 30);


        myPriorityQueue.display();
    }
}
