package com.restspring.demo.repository;

import com.restspring.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  Student findByEmailId(String emailId);
}
