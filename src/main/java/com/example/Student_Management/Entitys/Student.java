package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student
{

    private long slno;
    private String  studentName;
    @Id
    @Column(name ="student_rego")
    private String  studentRego;
    private String email;
    @ManyToOne
    @JoinColumn(name="semesterid")
    private Semester semester;
}
