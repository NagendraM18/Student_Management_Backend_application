package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject
{
    @Column(name = "slno")
    private  long slno;
    @Id
    @Column(name = "subjectid")
    private String subjectId;
    @Column(name = "subjectname")
    private String subjectName;
   @ManyToOne
   @JoinColumn(name = "semesterid")
    private Semester semester;
}
