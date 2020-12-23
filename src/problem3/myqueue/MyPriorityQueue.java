/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node front;

    public MyPriorityQueue() {
        this.front = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public void push(String name, int roll) {
        Node node = new Node(name, roll);
        Node prev = null;
        Node temp = front;
        if (front == null)
            front = node;
        else {
            if (front.getRollNo() > roll) {
                node.setNext(front);
                front = node;
            } else {
                while (temp.getNext() != null && temp.getRollNo() < roll) {
                    //prev = temp;
                    temp = temp.getNext();
                }
                //prev.setNext(n);
                node.setNext(temp.getNext());
                temp.setNext(node);

            }
        }
    }

    public void display() {
        Node n = front;
        while (n != null) {
            System.out.println("Name --> " + n.getName() + "\nRoll no --> " + n.getRollNo() + "\n");
            n = n.getNext();
        }
    }
}

