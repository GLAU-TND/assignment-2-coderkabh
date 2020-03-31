/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue();

        myCircularQueue.insert(new Student("Bhagwan kabhi", 0, 1));
        myCircularQueue.insert(new Student("Kisi ki", 3, 4));
        myCircularQueue.insert(new Student("Backlog", 2, 1));
        myCircularQueue.insert(new Student("Poori B.Tech", 2, 2));
        myCircularQueue.insert(new Student("Mai kabhi ", 5, 3));
        myCircularQueue.insert(new Student("Na ", 1, 1));
        myCircularQueue.insert(new Student("Lagne de", 3, 2));

        Student removeStudent = myCircularQueue.remove();
        if (removeStudent != null)
            System.out.println("Student removed and the is name is : " + removeStudent.getName());
        removeStudent = myCircularQueue.remove();
        if (removeStudent != null)
            System.out.println("Student removed and the is name is : " + removeStudent.getName());
        removeStudent = myCircularQueue.remove();
        if (removeStudent != null)
            System.out.println("Student removed and the is name is : " + removeStudent.getName());
        removeStudent = myCircularQueue.remove();
        if (removeStudent != null)
            System.out.println("Student removed and the is name is : " + removeStudent.getName());
        myCircularQueue.display();
        if (removeStudent != null)
            System.out.println("Student removed and the is name is : " + removeStudent.getName());
        myCircularQueue.display();


        // Demonstrated to remove 5 elements


    }
}
