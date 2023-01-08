package service.impl;

import model.Student;
import model.Student1;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student1> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public boolean save(Student1 student1) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
