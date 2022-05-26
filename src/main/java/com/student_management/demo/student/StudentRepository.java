package com.student_management.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT student FROM Student student WHERE student.email = ?1")
    Optional<Student> findStudentByEmail(String email);

    @Query("SELECT student FROM Student student WHERE student.name = ?1")
    Optional<Student> findStudentByName(String name);
}
