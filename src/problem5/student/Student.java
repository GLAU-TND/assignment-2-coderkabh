/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    String name;
    int backLogCount;
    int appearing;

    public Student(String name, int backLogCount, int appearing) {
        this.name = name;
        this.backLogCount = backLogCount;
        this.appearing = appearing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackLogCount() {
        return backLogCount;
    }

    public void setBackLogCount(int backLogCount) {
        this.backLogCount = backLogCount;
    }

    public int getAppearing() {
        return appearing;
    }

    public void setAppearing(int appearing) {
        this.appearing = appearing;
    }
}
