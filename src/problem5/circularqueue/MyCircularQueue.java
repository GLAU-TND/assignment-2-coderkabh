/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;


import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {

    Node front;
    Node rear;

    public MyCircularQueue() {
        rear = front = null;
    }

    public void insert(Student student) {
        if (student.getAppearing() > 2)
            System.out.println("Can't add this student to Queue : " + student.getName());
        else {
            Node node = new Node(student);
            if (front == null) {
                front = node;
            } else
                rear.setNext(node);
            rear = node;
            rear.setNext(front);
        }
    }

    public Student remove() {
        if (front == null)
            System.out.println("Queue is empty.");
        Student student = null;
        if (front == rear) {
            student = front.getStudent();
            front = rear = null;
        } else {
            Node temp = front;
            student = temp.getStudent();
            front = front.getNext();
            rear.setNext(front);
        }
        if (student.getBackLogCount() == 0)
            return student;
        else {
            insert(student);
            return null;
        }
    }


}
