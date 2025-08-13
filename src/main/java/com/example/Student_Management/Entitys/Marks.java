package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
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
    @Column(name = "marksId")
    private String marksId;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject;

    @Column(name = "marks")
    private Double marks;

}
