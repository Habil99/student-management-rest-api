package com.student_management.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(
//            StudentRepository studentRepository
//    ) {
//        return args -> {
//            Student jhon = new Student(
//                    "Jhon",
//                    "jhon@gmail.com",
//                    LocalDate.of(2001, Month.JANUARY, 12)
//            );
//
//            Student jane = new Student(
//                    "Jane",
//                    "jane@gmail.com",
//                    LocalDate.of(2000, Month.FEBRUARY, 27)
//            );
//
//            Student habil = new Student(
//                    "Habil",
//                    "abiyevhabil3@gmail.com",
//                    LocalDate.of(2001, Month.OCTOBER, 14)
//            );
//
//            studentRepository.saveAll(
//                    List.of(jane, jhon, habil)
//            );
//        };
//    }
}
