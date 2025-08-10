package com.example.Student_Management.DTO;

import com.example.Student_Management.Entitys.Semester;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto
{

    private long slno;
    private String  studentName;
    private String  studentRego;
    private String email;
    private String semesterid;
}
