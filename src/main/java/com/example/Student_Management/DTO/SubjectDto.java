package com.example.Student_Management.DTO;

import com.example.Student_Management.Entitys.Semester;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SubjectDto
{
    private  long slno;
    private String subjectid;
    private String subject;
    private String  semesterid;
}
