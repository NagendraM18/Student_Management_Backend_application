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

    @Column(name = "slno")
    private long slno;
    @Column(name = "studentName")
    private String  studentName;
    @Id
    @Column(name ="studentId")
    private String  studentId;
    private String email;
    @ManyToOne
    @JoinColumn(name="semesterId")
    private Semester semester;
}
