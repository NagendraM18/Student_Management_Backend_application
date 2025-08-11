package com.example.Student_Management.DTO;

import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Entitys.Subject;
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
public class MarksDTO
{

    private String marksid;

    private String studentid;

    private String subjectid;

    private Double marks;
}
