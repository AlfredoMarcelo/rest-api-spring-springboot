package com.restspring.demo.controller;

import com.restspring.demo.model.Student;
import com.restspring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @PostMapping
  public Student addStudent(@RequestBody Student student){
    return  studentService.addStudent(student);
  }

  @GetMapping
  public List<Student> getAllStudent(){
    return studentService.getAllStudent();
  }
}
