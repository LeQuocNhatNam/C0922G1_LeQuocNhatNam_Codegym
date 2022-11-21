package practice.UsingComparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",28,"PCL");
        Student student2 = new Student("Dinh",25,"HTM");
        Student student3 = new Student("Tuyen",47,"VCC");
        Student student4 = new Student("Bich",60,"NTT");
        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Collections.sort(studentList);
        for (Student student: studentList) {
            System.out.println(student.toString());
        }

        System.out.println("sorted by age: ");
        Collections.sort(studentList,new AgeComparator());
        for (Student student: studentList) {
            System.out.println(student.toString());
        }
    }
}
