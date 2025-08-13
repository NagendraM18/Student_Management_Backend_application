package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Subject
{
    @Column(name = "slno")
    private  long slno;
    @Id
    @Column(name = "subjectId")
    private String subjectId;
    @Column(name = "subjectName")
    private String subjectName;
   @ManyToOne
   @JoinColumn(name = "semesterId")
    private Semester semester;
}
