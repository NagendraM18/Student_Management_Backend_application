package com.example.Student_Management.DTO;

import com.example.Student_Management.Entitys.Department;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SemesterDto
{
    private long slno;
    private String semesterid;
    private  String semester;
    private String departmentname;
}
