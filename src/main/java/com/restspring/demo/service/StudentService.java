package com.restspring.demo.service;

import com.restspring.demo.model.Student;

import java.util.List;

public interface StudentService {
  Student addStudent(Student student);

  List<Student> getAllStudent();
}
