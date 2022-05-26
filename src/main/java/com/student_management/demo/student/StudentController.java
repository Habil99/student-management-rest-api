package com.student_management.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Student created successfully")
    public void createStudent(Student student) {
        studentService.createStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    @ResponseStatus(code = HttpStatus.OK, reason = "Student deleted successfully")
    public void deleteStudent(@PathVariable("studentId") Long id) {
        studentService.deleteStudent(id);
    }
}
