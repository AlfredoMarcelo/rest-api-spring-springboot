package com.restspring.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(
        name= "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                columnNames = "email_id"
        )
)
public class Student {

  @Id
  @SequenceGenerator(
          name = "student_sequence",
          sequenceName = "student_sequence",
          allocationSize = 1
  )
  @GeneratedValue(
          generator = "student_sequence",
          strategy = GenerationType.SEQUENCE
  )
  private Long id;
  private String firstName;
  private String lastName;
  @Column(
          name = "email_id",                    //email_id va a ser unique
          nullable = false
  )
  private String emailId;
}
