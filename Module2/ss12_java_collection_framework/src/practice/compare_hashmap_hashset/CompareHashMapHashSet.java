package practice.compare_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompareHashMapHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 28, "HTM");
        Student student2 = new Student("Định", 25, "LNH");
        Student student3 = new Student("Tuyen", 47, "VCC");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Student> studentEntry : studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }
        System.out.println("................Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student: studentSet){
            System.out.println(student.toString());
        }

    }
}
