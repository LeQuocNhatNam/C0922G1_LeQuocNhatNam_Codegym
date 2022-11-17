package exercise.implementing_array_list;

import java.util.ArrayList;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "James");
        Student b = new Student(2, "Peter");
        Student c = new Student(3, "John");
        Student d = new Student(4, "Mathew");
        Student e = new Student(5, "Paul");
        Student f = new Student(6,"Paul2");
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);

//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
//        System.out.println(studentMyList.indexOf(f));
//        System.out.println(studentMyList.contains(a));
//        System.out.println(studentMyList.contains(f));
        newStudentMyList = studentMyList.clone();
        Student student = newStudentMyList.remove(1);
        System.out.println(student.getName());

        for (int i = 0; i < newStudentMyList.size(); i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }



    }
}
