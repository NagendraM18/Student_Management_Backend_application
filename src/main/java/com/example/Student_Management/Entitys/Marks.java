package com.example.Student_Management.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marks
{
    @Id
    private String marksid;
    @ManyToOne
    @JoinColumn(name = "student_rego")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "subjectid")
    private Subject subject;

    private Double marks;

}
