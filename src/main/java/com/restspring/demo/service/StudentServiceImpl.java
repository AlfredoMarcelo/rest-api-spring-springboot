package com.restspring.demo.service;

import com.restspring.demo.model.Student;
import com.restspring.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student addStudent(Student student) {
    return studentRepository.save(student); // saveAll() debe recibir una List, save() recibe una instancia student
  }

  @Override
  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }

}
