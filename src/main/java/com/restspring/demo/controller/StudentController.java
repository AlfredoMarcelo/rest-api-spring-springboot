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

  @PostMapping      // new student
  public Student addStudent(@RequestBody Student student){
    return  studentService.addStudent(student);
  }

  @GetMapping       //get all student
  public List<Student> getAllStudent(){
    return studentService.getAllStudent();
  }

  @GetMapping("/{emailId}")   // get a student for emailId
  public Student getStudentByEmailId(@PathVariable String emailId){
    return studentService.getStudentByEmailId(emailId);
  }

  @DeleteMapping("/{studentId}")                                // para borrar se pide un id
  public String deleteStudent(@PathVariable Long studentId){
    return studentService.deleteStudent(studentId);
  }

  @PutMapping()
  public Student updateStudent(@RequestBody Student student){   //en put se solicita un obj student para actualizar
    return studentService.updateStudent(student);
  }

}
