package practice;

import java.rmi.StubNotFoundException;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Nam");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Hoang");

        s1.display();
        s2.display();
        s3.display();
    }
}
