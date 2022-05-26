package com.student_management.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void createStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        Optional<Student> studentByName = studentRepository.findStudentByName(student.getName());

        if (studentByEmail.isPresent() || studentByName.isPresent()) {
            throw new IllegalStateException("Student already exists");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean exists = studentRepository.existsById(id);

        if (!exists) {
            throw new IllegalStateException("Student with id " + id + " does not exist");
        }

        studentRepository.deleteById(id);
    }
}
