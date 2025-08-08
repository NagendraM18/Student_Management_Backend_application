package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Subject
{
    private long slno;
    @Id
    private String subjectsofSem;
 private long subject1;
 private long subject2;
 private long subject3;
 private long subject4;
 private long subject5;
 private long subject6;
 @OneToOne
 @JoinColumn(name = "semesterid")
    private Semester semesterobject;
}
