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
    private  long slno;
    @Id
    private String subjectid;
    private String subject;
   @ManyToOne
   @JoinColumn(name = "semesterId")
    private Semester semester;
}
