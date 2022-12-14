package student_management;

import java.util.List;
import java.util.Objects;

public class StudentService {

    private static final String STUDENT_PATH_NAME = "src/student_management/student_list_csv";

    public void addNewStudent(Student student) {
        List<Student> list = ReadFileStudent.readFileStudent(STUDENT_PATH_NAME);
        try {
            for (Student student1 : list) {
                if (Objects.equals(student1.getPhoneNumber(), student.getPhoneNumber())) {
                    throw new DuplicationPhoneNumberException("duplicated phone number");
                }
            }
        } catch (DuplicationPhoneNumberException e) {
            System.err.println(e.getMessage());
            return;
        }

        list.add(student);
        WriteFileStudent.writeFileStudent(STUDENT_PATH_NAME, list);
        System.out.println("Done!");
    }

    public void displayListStudents() {
        List<Student> list = ReadFileStudent.readFileStudent(STUDENT_PATH_NAME);
        if (list.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void searchStudent(String name) {
        List<Student> list = ReadFileStudent.readFileStudent(STUDENT_PATH_NAME);
        if (list.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i).getStudentName(), name)) {
                System.out.println(list.get(i));
            }
        }
    }
}
